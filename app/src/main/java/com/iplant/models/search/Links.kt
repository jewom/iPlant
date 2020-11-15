package com.iplant.models.search


import com.squareup.moshi.Json

data class Links(
    @field:Json(name = "genus")
    val genus: String?,
    @field:Json(name = "plant")
    val plant: String?,
    @field:Json(name = "self")
    val self: String?
)