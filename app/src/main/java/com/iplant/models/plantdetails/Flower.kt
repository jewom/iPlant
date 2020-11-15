package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Flower(
    @field:Json(name = "color")
    val color: Any?,
    @field:Json(name = "conspicuous")
    val conspicuous: Any?
)