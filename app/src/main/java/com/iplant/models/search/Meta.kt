package com.iplant.models.search


import com.squareup.moshi.Json

data class Meta(
    @field:Json(name = "total")
    val total: Int?
)