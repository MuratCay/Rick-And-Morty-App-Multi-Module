package com.feature.characterdetail

import com.core.common.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterDetailViewModel @Inject constructor() : BaseViewModel<CharacterDetailState>() {
    override fun setInitialState(): CharacterDetailState {
        TODO("Not yet implemented")
    }
}