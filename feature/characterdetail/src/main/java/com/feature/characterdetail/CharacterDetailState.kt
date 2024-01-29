package com.feature.characterdetail

import com.core.common.IState

sealed interface CharacterDetailState : IState {
    object Loading : CharacterDetailState
}