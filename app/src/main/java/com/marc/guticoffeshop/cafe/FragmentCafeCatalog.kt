package com.marc.guticoffeshop.cafe

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.marc.guticoffeshop.R
import com.marc.guticoffeshop.adapter.MenuCafeAdapter
import com.marc.guticoffeshop.adapter.MenuMenjarAdapter
import com.marc.guticoffeshop.databinding.FragmentCafeCatalogBinding
import com.marc.guticoffeshop.databinding.FragmentMenjarCatalogBinding
import com.marc.guticoffeshop.menjar.Menjar
import com.marc.guticoffeshop.menjar.MenuMenjarProvider

class FragmentCafeCatalog : Fragment() {

    private lateinit var  binding: FragmentCafeCatalogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentCafeCatalogBinding.inflate(inflater, container, false)
        binding.recyclerCafe.layoutManager = LinearLayoutManager(this.context)
        val root: View = binding.root
        binding.recyclerCafe.adapter = MenuCafeAdapter(MenuCafeProvider.cafeList) { cafe ->
            onSelected(
                cafe
            )
        }

        setHasOptionsMenu(true)

        return root
    }
    fun onSelected (cafe: Cafe){
        Toast.makeText(requireContext(), cafe.nom, Toast.LENGTH_SHORT).show()
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