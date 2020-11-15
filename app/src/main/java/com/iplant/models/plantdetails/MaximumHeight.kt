package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class MaximumHeight(
    @field:Json(name = "cm")
    val cm: Any?
)