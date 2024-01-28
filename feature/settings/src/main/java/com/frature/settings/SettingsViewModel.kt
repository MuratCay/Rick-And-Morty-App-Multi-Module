package com.frature.settings

import com.core.common.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor() : BaseViewModel<SettingsState>() {
    override fun setInitialState(): SettingsState {
        TODO("Not yet implemented")
    }
}