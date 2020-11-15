package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class LinksXXXXX(
    @field:Json(name = "genus")
    val genus: String?,
    @field:Json(name = "plant")
    val plant: String?,
    @field:Json(name = "self")
    val self: String?
)