package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class LinksXX(
    @field:Json(name = "genus")
    val genus: String?,
    @field:Json(name = "self")
    val self: String?,
    @field:Json(name = "species")
    val species: String?
)