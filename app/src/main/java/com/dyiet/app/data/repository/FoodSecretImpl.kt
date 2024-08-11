package com.dyiet.app.data.repository

import com.dyiet.app.data.entities.FSSearchFoodResponse
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import javax.inject.Inject

class FoodSecretImpl @Inject constructor(
    private val client: OkHttpClient
): FoodSecret {
    override suspend fun searchProducts(searchTerm: String): FSSearchFoodResponse? {
        val request = Request.Builder().url(URL).build()

        return try {
            val gson = Gson()
            val response = client.newCall(request).execute().body
            gson.fromJson(response?.string(), FSSearchFoodResponse::class.java)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    companion object {
        const val URL = "https://platform.fatsecret.com/rest/server.api"
    }

}