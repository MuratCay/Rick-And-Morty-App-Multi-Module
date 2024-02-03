package com.core.domain.repository

import kotlinx.coroutines.flow.Flow
import com.core.model.Character

interface CharacterRepository {
    // Remote and cache
    suspend fun getCharacters(): Flow<List<Character>>
    suspend fun getCharacter(characterId: Long): Flow<Character>
}