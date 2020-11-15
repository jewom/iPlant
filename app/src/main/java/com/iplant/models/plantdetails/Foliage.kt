package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Foliage(
    @field:Json(name = "color")
    val color: Any?,
    @field:Json(name = "leaf_retention")
    val leafRetention: Any?,
    @field:Json(name = "texture")
    val texture: Any?
)