package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Synonym(
    @field:Json(name = "author")
    val author: String?,
    @field:Json(name = "id")
    val id: Int?,
    @field:Json(name = "name")
    val name: String?
)