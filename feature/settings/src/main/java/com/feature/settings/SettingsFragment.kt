package com.feature.settings

import com.core.common.base.BaseFragment
import com.frature.settings.R
import com.frature.settings.databinding.FragmentSettingsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingsFragment :
    BaseFragment<FragmentSettingsBinding, SettingsViewModel>(R.layout.fragment_settings) {

    override fun getViewModelClass(): Class<SettingsViewModel> = SettingsViewModel::class.java

    override fun initObserver() {

    }

    override fun initViews() {

    }

}