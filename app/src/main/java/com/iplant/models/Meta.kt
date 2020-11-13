package com.iplant.models


import com.squareup.moshi.Json

data class Meta(
    @Json(name = "total")
    val total: Int
)