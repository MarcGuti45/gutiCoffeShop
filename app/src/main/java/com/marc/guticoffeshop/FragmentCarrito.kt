package com.marc.guticoffeshop

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.*
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.marc.guticoffeshop.SharedViewModel.Companion.llistaCafes
import com.marc.guticoffeshop.SharedViewModel.Companion.llistaPreus
import com.marc.guticoffeshop.SharedViewModel.Companion.sumaTotal
import com.marc.guticoffeshop.databinding.FragmentCarritoBinding

class FragmentCarrito : Fragment() {

    private lateinit var binding: FragmentCarritoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCarritoBinding.inflate(inflater,container, false)
        val PagarViewModel = ViewModelProvider(this).get(PagarViewModel::class.java)

        val llistaProductes: ListView = binding.listaRecibo
        PagarViewModel.text.observe(viewLifecycleOwner) {
            llistaProductes.findViewById<ListView>(R.id.lista_recibo)
        }

        val textView: TextView = binding.recibo
        PagarViewModel.text.observe(viewLifecycleOwner) {
            textView.findViewById<TextView>(R.id.recibo)
        }

        val buttonPagament: Button = binding.buttonPagar
        PagarViewModel.text.observe(viewLifecycleOwner){
            buttonPagament.findViewById<Button>(R.id.buttonPagar)
        }

        textView.setText(sumaTotal().toString())

        val arrayAdapter: ArrayAdapter<*>
        var showListView = binding.listaRecibo
        arrayAdapter = ArrayAdapter(requireContext(),
            android.R.layout.simple_list_item_1, llistaCafes)
        showListView.adapter = arrayAdapter

        showCafes()
        buttonPagament.setOnClickListener{
            llistaPreus.clear()
            llistaCafes.clear()
            Toast.makeText(requireContext(), "Gracias por su compra, vuelva pronto", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.fragmentIni2)
        }

        setHasOptionsMenu(true)

        return binding.root
    }


    fun showCafes(){
        for(item in llistaCafes){
            println(item)
        }
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