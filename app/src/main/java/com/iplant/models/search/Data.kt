package com.iplant.models.search


import com.squareup.moshi.Json

data class Data(
    @field:Json(name = "author")
    val author: String?,
    @field:Json(name = "bibliography")
    val bibliography: String?,
    @field:Json(name = "common_name")
    val commonName: String?,
    @field:Json(name = "family")
    val family: String?,
    @field:Json(name = "family_common_name")
    val familyCommonName: String?,
    @field:Json(name = "genus")
    val genus: String?,
    @field:Json(name = "genus_id")
    val genusId: Int?,
    @field:Json(name = "id")
    val id: Int?,
    @field:Json(name = "image_url")
    val imageUrl: String?,
    @field:Json(name = "links")
    val links: Links?,
    @field:Json(name = "rank")
    val rank: String?,
    @field:Json(name = "scientific_name")
    val scientificName: String?,
    @field:Json(name = "slug")
    val slug: String?,
    @field:Json(name = "status")
    val status: String?,
    @field:Json(name = "synonyms")
    val synonyms: List<String>?,
    @field:Json(name = "year")
    val year: Int?
)