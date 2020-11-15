package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class FruitOrSeed(
    @field:Json(name = "color")
    val color: Any?,
    @field:Json(name = "conspicuous")
    val conspicuous: Any?,
    @field:Json(name = "seed_persistence")
    val seedPersistence: Any?,
    @field:Json(name = "shape")
    val shape: Any?
)