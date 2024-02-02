package com.feature.characterdetail

import com.core.common.base.IState

sealed interface CharacterDetailState : IState {
    object Loading : CharacterDetailState
}