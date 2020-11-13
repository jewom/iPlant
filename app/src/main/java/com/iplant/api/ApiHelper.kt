package com.iplant.api

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiHelper {

    private const val BASE_URL = "https://trefle.io/api/v1/"
    private const val API_TOKEN = "XSXuKYouEIT6QBuNypFDRIVXIiL6ZdG-M0VNx1f7vuU"

    private val okHttpClient = OkHttpClient()
        .newBuilder()
        .addInterceptor(tokenInterceptor())
        .build()

    val apiService: ApiService by lazy {
        val retrofit: Retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        return@lazy retrofit.create(ApiService::class.java)
    }

    private fun tokenInterceptor(): Interceptor {
        return Interceptor.invoke { chain ->
            var request = chain.request()
            val url: HttpUrl = request.url.newBuilder().addQueryParameter("token", API_TOKEN).build()
            request = request.newBuilder().url(url).build()
            chain.proceed(request)
        }
    }

}