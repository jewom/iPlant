package com.iplant.models


import com.squareup.moshi.Json

data class LinksX(
    @Json(name = "first")
    val first: String,
    @Json(name = "last")
    val last: String,
    @Json(name = "self")
    val self: String
)