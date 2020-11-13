package com.iplant.models


import com.squareup.moshi.Json

data class SearchResult(
    @Json(name = "data")
    val `data`: List<Data>,
    @Json(name = "links")
    val links: LinksX,
    @Json(name = "meta")
    val meta: Meta
)