package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Growth(
    @field:Json(name = "atmospheric_humidity")
    val atmosphericHumidity: Any?,
    @field:Json(name = "bloom_months")
    val bloomMonths: Any?,
    @field:Json(name = "days_to_harvest")
    val daysToHarvest: Any?,
    @field:Json(name = "description")
    val description: Any?,
    @field:Json(name = "fruit_months")
    val fruitMonths: Any?,
    @field:Json(name = "growth_months")
    val growthMonths: Any?,
    @field:Json(name = "light")
    val light: Any?,
    @field:Json(name = "maximum_precipitation")
    val maximumPrecipitation: MaximumPrecipitation?,
    @field:Json(name = "maximum_temperature")
    val maximumTemperature: MaximumTemperature?,
    @field:Json(name = "minimum_precipitation")
    val minimumPrecipitation: MinimumPrecipitation?,
    @field:Json(name = "minimum_root_depth")
    val minimumRootDepth: MinimumRootDepth?,
    @field:Json(name = "minimum_temperature")
    val minimumTemperature: MinimumTemperature?,
    @field:Json(name = "ph_maximum")
    val phMaximum: Any?,
    @field:Json(name = "ph_minimum")
    val phMinimum: Any?,
    @field:Json(name = "row_spacing")
    val rowSpacing: RowSpacing?,
    @field:Json(name = "soil_humidity")
    val soilHumidity: Any?,
    @field:Json(name = "soil_nutriments")
    val soilNutriments: Any?,
    @field:Json(name = "soil_salinity")
    val soilSalinity: Any?,
    @field:Json(name = "soil_texture")
    val soilTexture: Any?,
    @field:Json(name = "sowing")
    val sowing: Any?,
    @field:Json(name = "spread")
    val spread: Spread?
)