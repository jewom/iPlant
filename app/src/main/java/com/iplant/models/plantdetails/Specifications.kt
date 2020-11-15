package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Specifications(
    @field:Json(name = "average_height")
    val averageHeight: AverageHeight?,
    @field:Json(name = "growth_form")
    val growthForm: Any?,
    @field:Json(name = "growth_habit")
    val growthHabit: Any?,
    @field:Json(name = "growth_rate")
    val growthRate: Any?,
    @field:Json(name = "ligneous_type")
    val ligneousType: Any?,
    @field:Json(name = "maximum_height")
    val maximumHeight: MaximumHeight?,
    @field:Json(name = "nitrogen_fixation")
    val nitrogenFixation: Any?,
    @field:Json(name = "shape_and_orientation")
    val shapeAndOrientation: Any?,
    @field:Json(name = "toxicity")
    val toxicity: Any?
)