package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class MaximumTemperature(
    @field:Json(name = "deg_c")
    val degC: Any?,
    @field:Json(name = "deg_f")
    val degF: Any?
)