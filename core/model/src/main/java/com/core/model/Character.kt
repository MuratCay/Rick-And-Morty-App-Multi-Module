package com.core.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Character(
    @SerialName("info")
    val info: Info?,
    @SerialName("results")
    val characterDetails: List<CharacterDetail?>?
)