package com.example.consumerresapi.model




@Serialzable
data class Kontak(
    val id: Int,
    val nama: String,
    val alamat: String,
    @SerialName(value = "telpon")
    val nohp: String
)
