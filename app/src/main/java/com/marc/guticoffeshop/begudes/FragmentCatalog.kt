package com.marc.guticoffeshop.begudes

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.marc.guticoffeshop.MainActivity
import com.marc.guticoffeshop.R
import com.marc.guticoffeshop.adapter.MenuBegudaAdapter
import com.marc.guticoffeshop.begudes.Begudes
import com.marc.guticoffeshop.begudes.MenuBegudaProvider
import com.marc.guticoffeshop.database.BegudesDataBase
import com.marc.guticoffeshop.databinding.FragmentCatalogBinding
import com.marc.guticoffeshop.menjar.FragmentMenjarCatalog


class FragmentCatalog : Fragment() {

    private lateinit var  binding: FragmentCatalogBinding
   // private val begudesDatabase by lazy { BegudesDataBase.getDatabase(this)begudesDao() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentCatalogBinding.inflate(inflater, container, false)
        binding.recyclerBegudes.layoutManager = LinearLayoutManager(this.context)
        val root:View = binding.root
        binding.recyclerBegudes.adapter = MenuBegudaAdapter(MenuBegudaProvider.begudaList) { begudes ->
            onSelected(
                begudes
            )
        }

        setHasOptionsMenu(true)

        return root
    }
    fun onSelected (beguda : Begudes){
        Toast.makeText(requireContext(), beguda.nom, Toast.LENGTH_SHORT).show()

    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}