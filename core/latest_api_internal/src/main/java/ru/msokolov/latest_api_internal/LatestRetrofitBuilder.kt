package ru.msokolov.latest_api_internal

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.msokolov.onlineshop.latest_api.LatestApiService

object LatestRetrofitBuilder {

    private fun buildRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://run.mocky.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun latestApiService(): LatestApiService {
        return buildRetrofit().create(LatestApiService::class.java)
    }
}