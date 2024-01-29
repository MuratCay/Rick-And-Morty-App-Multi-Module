package com.feature.characterlist

import com.core.common.IState

sealed interface CharacterListState : IState {
    object Loading : CharacterListState
}