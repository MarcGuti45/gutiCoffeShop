package com.marc.guticoffeshop.menjar

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.marc.guticoffeshop.R
import com.marc.guticoffeshop.SharedViewModel.Companion.llistaCafes
import com.marc.guticoffeshop.SharedViewModel.Companion.llistaPreus
import com.marc.guticoffeshop.adapter.MenuMenjarAdapter
import com.marc.guticoffeshop.databinding.FragmentMenjarCatalogBinding

class FragmentMenjarCatalog : Fragment() {

    private lateinit var  binding: FragmentMenjarCatalogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentMenjarCatalogBinding.inflate(inflater, container, false)
        binding.recyclerMenjar.layoutManager = LinearLayoutManager(this.context)
        val root: View = binding.root
        binding.recyclerMenjar.adapter = MenuMenjarAdapter(MenuMenjarProvider.menjarList) { menjar ->
            onSelected(
                menjar
            )
        }

        setHasOptionsMenu(true)

        return root
    }
    fun onSelected (menjar: Menjar){
        Toast.makeText(requireContext(), menjar.nom, Toast.LENGTH_SHORT).show()
        llistaCafes.add(menjar.nom)
        llistaPreus.add(menjar.preu)

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