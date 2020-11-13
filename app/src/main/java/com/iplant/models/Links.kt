package com.iplant.models


import com.squareup.moshi.Json

data class Links(
    @Json(name = "genus")
    val genus: String,
    @Json(name = "plant")
    val plant: String,
    @Json(name = "self")
    val self: String
)