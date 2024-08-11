package com.diyet.app.data.repository

import com.diyet.app.data.entities.FSSearchFoodResponse

interface FoodSecret {
    suspend fun searchProducts(searchTerm: String): FSSearchFoodResponse?
}