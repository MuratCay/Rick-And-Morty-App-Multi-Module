package com.feature.characterlist

import com.core.common.base.IState

sealed interface CharacterListState : IState {
    object Loading : CharacterListState
}