package com.iplant.models.search


import com.squareup.moshi.Json

data class SearchResult(
    @field:Json(name = "data")
    val `data`: List<Data>?,
    @field:Json(name = "links")
    val links: LinksX?,
    @field:Json(name = "meta")
    val meta: Meta?
)