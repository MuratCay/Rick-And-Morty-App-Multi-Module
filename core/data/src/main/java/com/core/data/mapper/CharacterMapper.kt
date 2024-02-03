package com.core.data.mapper

import com.core.data.models.CharacterEntity
import com.core.model.CharacterDetail
import javax.inject.Inject

class CharacterMapper @Inject constructor(
    private val locationMapper: CharacterLocationMapper
) : Mapper<CharacterEntity, CharacterDetail> {

    override fun mapFromEntity(type: CharacterEntity): CharacterDetail {
        return CharacterDetail(
            created = type.created,
            gender = type.gender,
            id = type.id,
            image = type.image,
            location = locationMapper.mapFromEntity(type.characterLocation),
            name = type.name,
            species = type.species,
            status = type.status,
            type = type.type,
            url = type.url,
            episode = emptyList(),
            origin = null,
            isBookMarked = type.isBookMarked
        )
    }

    override fun mapToEntity(type: CharacterDetail): CharacterEntity {
        return CharacterEntity(
            created = type.created.orEmpty(),
            gender = type.gender.orEmpty(),
            id = type.id ?: 0,
            image = type.image.orEmpty(),
            characterLocation = locationMapper.mapToEntity(type.location),
            name = type.name.orEmpty(),
            species = type.species.orEmpty(),
            status = type.status.orEmpty(),
            type = type.type.orEmpty(),
            url = type.url.orEmpty(),
            isBookMarked = type.isBookMarked
        )
    }
}