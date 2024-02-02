package com.core.data.remote.service

import com.core.model.Character
import com.core.model.Result
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    @GET("character")
    suspend fun getCharacters(): Character

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Long): Result
}