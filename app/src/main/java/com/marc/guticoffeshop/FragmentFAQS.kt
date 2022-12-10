package com.marc.guticoffeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.marc.guticoffeshop.databinding.FragmentFaqsBinding


class FragmentFAQS : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentFaqsBinding>(inflater,
            R.layout.fragment_faqs,container,false)
        return binding.root
    }
}