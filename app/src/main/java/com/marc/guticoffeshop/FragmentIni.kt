package com.marc.guticoffeshop

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.databinding.ViewDataBinding
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.marc.guticoffeshop.databinding.FragmentIniBinding


class FragmentIni : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
         val binding = DataBindingUtil.inflate<FragmentIniBinding>(inflater,
            R.layout.fragment_ini,container,false)


        binding.button.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_fragmentIni2_to_fragmentCatalog)
        }

        setHasOptionsMenu(true)

        return binding.root


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