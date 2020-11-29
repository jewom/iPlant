package com.iplant.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PlantEntity(
    @PrimaryKey(autoGenerate = false)
    var slug: String,
    var isFavorite: Boolean = false,
    var comment: String = ""
)