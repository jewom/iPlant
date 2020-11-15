package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Family(
    @field:Json(name = "common_name")
    val commonName: String?,
    @field:Json(name = "id")
    val id: Int?,
    @field:Json(name = "links")
    val links: Links?,
    @field:Json(name = "name")
    val name: String?,
    @field:Json(name = "slug")
    val slug: String?
)