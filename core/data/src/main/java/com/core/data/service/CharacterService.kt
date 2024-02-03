package com.core.data.service

import com.core.model.Character
import com.core.model.CharacterDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    @GET("character")
    suspend fun getCharacters(): Character

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Long): CharacterDetail
}