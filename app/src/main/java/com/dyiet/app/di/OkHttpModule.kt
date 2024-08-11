package com.dyiet.app.repository

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Cache
import okhttp3.OkHttpClient
import java.io.File
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object OkHttpModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(@ApplicationContext context: Context): OkHttpClient {
        return OkHttpClient.Builder().cache(
            Cache(
                directory = File(context.cacheDir, "http_cache"),
                maxSize = 10L * 1024L * 1024L // 10MB
            )
        ).build()
    }
}