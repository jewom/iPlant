package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Source(
    @field:Json(name = "citation")
    val citation: String?,
    @field:Json(name = "id")
    val id: String?,
    @field:Json(name = "last_update")
    val lastUpdate: String?,
    @field:Json(name = "name")
    val name: String?,
    @field:Json(name = "url")
    val url: String?
)