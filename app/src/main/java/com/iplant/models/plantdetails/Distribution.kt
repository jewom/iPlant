package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Distribution(
    @field:Json(name = "native")
    val native: List<String>?
)