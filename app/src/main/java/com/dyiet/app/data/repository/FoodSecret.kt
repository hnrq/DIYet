package com.dyiet.app.data.repository

import com.dyiet.app.data.entities.FSSearchFoodResponse

interface FoodSecret {
    suspend fun searchProducts(searchTerm: String): FSSearchFoodResponse?
}