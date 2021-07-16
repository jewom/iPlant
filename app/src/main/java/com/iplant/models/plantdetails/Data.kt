package com.iplant.models.plantdetails


import com.squareup.moshi.Json

data class Data(
    @field:Json(name = "author")
    val author: String?,
    @field:Json(name = "bibliography")
    val bibliography: String?,
    @field:Json(name = "common_name")
    val commonName: String?,
    @field:Json(name = "family")
    val family: Family?,
    @field:Json(name = "family_common_name")
    val familyCommonName: String?,
    @field:Json(name = "forms")
    val forms: List<Any>?,
    @field:Json(name = "genus")
    val genus: Genus?,
    @field:Json(name = "genus_id")
    val genusId: String?,
    @field:Json(name = "hybrids")
    val hybrids: List<Any>?,
    @field:Json(name = "id")
    val id: String?,
    @field:Json(name = "image_url")
    val imageUrl: String?,
    @field:Json(name = "links")
    val links: LinksXX?,
    @field:Json(name = "main_species")
    val mainSpecies: MainSpecies?,
    @field:Json(name = "main_species_id")
    val mainSpeciesId: Int?,
    @field:Json(name = "observations")
    val observations: String?,
    @field:Json(name = "scientific_name")
    val scientificName: String?,
    @field:Json(name = "slug")
    val slug: String?,
    @field:Json(name = "sources")
    val sources: List<SourceX>?,
    @field:Json(name = "species")
    val species: List<Specy>?,
    @field:Json(name = "subspecies")
    val subspecies: List<Any>?,
    @field:Json(name = "subvarieties")
    val subvarieties: List<Any>?,
    @field:Json(name = "varieties")
    val varieties: List<Any>?,
    @field:Json(name = "vegetable")
    val vegetable: Boolean?,
    @field:Json(name = "year")
    val year: Int?
)