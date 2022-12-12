package com.marc.guticoffeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.marc.guticoffeshop.adapter.MenuBegudaAdapter
import com.marc.guticoffeshop.databinding.ActivityMainBinding
import com.marc.guticoffeshop.databinding.FragmentCatalogBinding


class FragmentCatalog : Fragment() {

    private lateinit var  binding: FragmentCatalogBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentCatalogBinding.inflate(inflater, container, false)
        binding.recyclerBegudes.layoutManager = LinearLayoutManager(this.context)
        val root:View = binding.root
        binding.recyclerBegudes.adapter = MenuBegudaAdapter(MenuBegudaProvider.begudaList)

        return root
    }
    fun onSelected (beguda : Begudes){
        Toast.makeText(requireContext(), beguda.nom, Toast.LENGTH_SHORT).show()
    }
}