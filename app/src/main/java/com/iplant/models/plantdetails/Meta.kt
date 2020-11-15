package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Meta(
    @field:Json(name = "last_modified")
    val lastModified: String?
)