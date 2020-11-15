package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Native(
    @field:Json(name = "id")
    val id: Int?,
    @field:Json(name = "links")
    val links: LinksXXX?,
    @field:Json(name = "name")
    val name: String?,
    @field:Json(name = "slug")
    val slug: String?,
    @field:Json(name = "species_count")
    val speciesCount: Int?,
    @field:Json(name = "tdwg_code")
    val tdwgCode: String?,
    @field:Json(name = "tdwg_level")
    val tdwgLevel: Int?
)