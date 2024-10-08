package com.diyet.app.data.repository

interface AuthenticationRepository {
    suspend fun signIn(email: String): Boolean
    suspend fun signInWithGoogle(): Boolean
}