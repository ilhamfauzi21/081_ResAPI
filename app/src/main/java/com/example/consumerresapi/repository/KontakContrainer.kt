package com.example.consumerresapi.repository

import com.example.consumerresapi.network.KontakService
import retrofit2.Retrofit

class KontakContrainer {
    val kontakRepository: KontakRepository
}


class KontakContrainer : AppContainer {
    private val baseurl = "https://kancadonor.net//donoorg"
    private val json = Json { ignoreUnknownKeys = true }
    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(baseurl)
        .build()

    private val kontakService: KontakService by lozy{
        retrofit.create(KontakService::class.java)
    }
    override val KontakRepository: KontakRepository by lazy {
        NetworkKontakRepository(kontakService)
    }

}