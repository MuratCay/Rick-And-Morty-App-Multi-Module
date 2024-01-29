package com.feature.characterlist

import com.core.common.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterListViewModel @Inject constructor() : BaseViewModel<CharacterListState>() {
    override fun setInitialState(): CharacterListState = CharacterListState.Loading
}