package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Images(
    @field:Json(name = "bark")
    val bark: List<Any>?,
    @field:Json(name = "flower")
    val flower: List<Any>?,
    @field:Json(name = "fruit")
    val fruit: List<Any>?,
    @field:Json(name = "habit")
    val habit: List<Any>?,
    @field:Json(name = "leaf")
    val leaf: List<Any>?,
    @field:Json(name = "other")
    val other: List<Any>?
)