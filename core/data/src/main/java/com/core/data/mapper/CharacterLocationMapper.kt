package com.core.data.mapper

import com.core.data.models.CharacterLocationEntity
import com.core.model.Location
import javax.inject.Inject

class CharacterLocationMapper @Inject constructor() : Mapper<CharacterLocationEntity, Location> {

    override fun mapFromEntity(type: CharacterLocationEntity): Location {
        return Location(name = type.name, url = type.url)
    }

    override fun mapToEntity(type: Location): CharacterLocationEntity {
        return CharacterLocationEntity(name = type.name, url = type.url)
    }
}