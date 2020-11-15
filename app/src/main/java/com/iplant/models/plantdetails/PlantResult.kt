package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class PlantResult(
    @field:Json(name = "data")
    val `data`: Data?,
    @field:Json(name = "meta")
    val meta: Meta?
)