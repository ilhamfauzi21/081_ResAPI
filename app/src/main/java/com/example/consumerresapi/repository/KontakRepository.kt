package com.example.consumerresapi.repository

import com.example.consumerresapi.model.Kontak
import com.example.consumerresapi.network.KontakService

interface KontakRepository {
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {

    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}