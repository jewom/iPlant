package com.iplant.repositories

import com.iplant.App
import com.iplant.database.AppDatabase
import com.iplant.database.PlantDao
import com.iplant.database.PlantEntity

object PlantsLocalRepository {

    private val plantDao: PlantDao = AppDatabase.getInstance(App.appContext).plantDao()

    fun getAllPlantEntities() = plantDao.getAllPlantEntities()
    fun getPlantEntity(slug: String) = plantDao.getPlantEntity(slug)
    suspend fun insertPlantEntity(plantEntity: PlantEntity) = plantDao.insertPlantEntity(plantEntity)

}