package com.marc.guticoffeshop.contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.marc.guticoffeshop.R
import com.marc.guticoffeshop.databinding.FragmentContactBinding


class FragmentContact : Fragment() {
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentContactBinding>(inflater,
            R.layout.fragment_contact,container,false)
        return binding.root
    }
}