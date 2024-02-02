package com.feature.settings

import com.core.common.base.IState

sealed interface SettingsState : IState {
    object Loading : SettingsState
}