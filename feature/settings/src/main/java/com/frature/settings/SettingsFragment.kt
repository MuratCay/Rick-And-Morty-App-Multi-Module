package com.frature.settings

import com.core.common.base.BaseFragment
import com.frature.settings.databinding.FragmentSettingsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingsFragment :
    BaseFragment<FragmentSettingsBinding, SettingsViewModel>(R.layout.fragment_settings) {

    override fun getViewModelClass(): Class<SettingsViewModel> = SettingsViewModel::class.java

    override fun initObserver() {
        TODO("Not yet implemented")
    }

    override fun initViews() {
        TODO("Not yet implemented")
    }

}