package com.diyet.app.data.entities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FSSearchFoodResponse(
    @SerialName("foods")
    val foods: List<FSFoodResponse>
)

@Serializable
data class FSFoodResponse(
    @SerialName("food_id")
    val id: String,
    @SerialName("food_name")
    val name: String,
    @SerialName("brand_name")
    val brandName: String?,
    @SerialName("food_type")
    val type: String,
    @SerialName("food_url")
    val url: String
)