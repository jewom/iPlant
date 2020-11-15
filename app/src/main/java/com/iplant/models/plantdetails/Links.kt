package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Links(
    @field:Json(name = "division_order")
    val divisionOrder: String?,
    @field:Json(name = "genus")
    val genus: String?,
    @field:Json(name = "self")
    val self: String?
)