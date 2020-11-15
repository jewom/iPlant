package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Distributions(
    @field:Json(name = "native")
    val native: List<Native>?
)