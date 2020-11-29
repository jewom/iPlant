package com.iplant.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PlantDao {

    @Query("SELECT * FROM PlantEntity")
    fun getAllPlantEntities(): LiveData<List<PlantEntity>>

    @Query("SELECT * FROM PlantEntity WHERE slug = :slug")
    fun getPlantEntity(slug: String): LiveData<PlantEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPlantEntity(plantEntity: PlantEntity)

}