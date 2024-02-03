package com.core.domain.repository

import com.core.data.service.CharacterService
import com.core.model.Character
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val characterService: CharacterService
) : CharacterRepository {

    override suspend fun getCharacters(): Flow<List<Character>> {
        return flow {
            val characterResponse = characterService.getCharacters().characterDetails
        }
    }

    override suspend fun getCharacter(characterId: Long): Flow<Character> {
        TODO("Not yet implemented")
    }
}