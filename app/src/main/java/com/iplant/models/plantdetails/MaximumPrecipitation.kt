package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class MaximumPrecipitation(
    @field:Json(name = "mm")
    val mm: Any?
)