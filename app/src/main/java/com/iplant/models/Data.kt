package com.iplant.models


import com.squareup.moshi.Json

data class Data(
    @Json(name = "author")
    val author: String,
    @Json(name = "bibliography")
    val bibliography: String,
    @Json(name = "common_name")
    val commonName: String,
    @Json(name = "family")
    val family: String,
    @Json(name = "family_common_name")
    val familyCommonName: String,
    @Json(name = "genus")
    val genus: String,
    @Json(name = "genus_id")
    val genusId: Int,
    @Json(name = "id")
    val id: Int,
    @Json(name = "image_url")
    val imageUrl: String,
    @Json(name = "links")
    val links: Links,
    @Json(name = "rank")
    val rank: String,
    @Json(name = "scientific_name")
    val scientificName: String,
    @Json(name = "slug")
    val slug: String,
    @Json(name = "status")
    val status: String,
    @Json(name = "synonyms")
    val synonyms: List<String>,
    @Json(name = "year")
    val year: Int
)