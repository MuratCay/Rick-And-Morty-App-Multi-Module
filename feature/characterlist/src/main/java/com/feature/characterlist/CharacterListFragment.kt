package com.feature.characterlist

import com.core.common.base.BaseFragment
import com.feature.characterlist.databinding.FragmentCharacterListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharacterListFragment :
    BaseFragment<FragmentCharacterListBinding, CharacterListViewModel>(R.layout.fragment_character_list) {
    override fun getViewModelClass(): Class<CharacterListViewModel> {
        TODO("Not yet implemented")
    }

    override fun initObserver() {
        TODO("Not yet implemented")
    }

    override fun initViews() {
        TODO("Not yet implemented")
    }
}