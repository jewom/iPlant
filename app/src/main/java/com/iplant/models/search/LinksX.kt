package com.iplant.models.search


import com.squareup.moshi.Json

data class LinksX(
    @field:Json(name = "first")
    val first: String?,
    @field:Json(name = "last")
    val last: String?,
    @field:Json(name = "self")
    val self: String?
)