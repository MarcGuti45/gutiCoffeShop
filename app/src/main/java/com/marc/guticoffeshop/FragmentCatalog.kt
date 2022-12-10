package com.marc.guticoffeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.marc.guticoffeshop.databinding.FragmentCatalogBinding


class FragmentCatalog : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentCatalogBinding>(inflater,
            R.layout.fragment_catalog,container,false)
        return binding.root
    }
}