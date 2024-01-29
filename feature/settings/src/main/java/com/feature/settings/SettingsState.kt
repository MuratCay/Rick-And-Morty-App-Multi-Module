package com.feature.settings

import com.core.common.IState

sealed interface SettingsState : IState {
    object Loading : SettingsState
}