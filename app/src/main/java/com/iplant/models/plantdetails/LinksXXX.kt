package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class LinksXXX(
    @field:Json(name = "plants")
    val plants: String?,
    @field:Json(name = "self")
    val self: String?,
    @field:Json(name = "species")
    val species: String?
)