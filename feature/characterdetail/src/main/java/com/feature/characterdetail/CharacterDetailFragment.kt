package com.feature.characterdetail

import com.core.common.base.BaseFragment
import com.feature.characterdetail.databinding.FragmentCharacterDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharacterDetailFragment :
    BaseFragment<FragmentCharacterDetailBinding, CharacterDetailViewModel>(R.layout.fragment_character_detail) {

    override fun getViewModelClass(): Class<CharacterDetailViewModel> = CharacterDetailViewModel::class.java

    override fun initObserver() {
        TODO("Not yet implemented")
    }

    override fun initViews() {
        TODO("Not yet implemented")
    }
}