package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Genus(
    @field:Json(name = "id")
    val id: Int?,
    @field:Json(name = "links")
    val links: LinksX?,
    @field:Json(name = "name")
    val name: String?,
    @field:Json(name = "slug")
    val slug: String?
)