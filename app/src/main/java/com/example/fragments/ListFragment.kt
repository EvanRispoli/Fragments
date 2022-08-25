package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments.databinding.FragmentHomeBinding
import com.example.fragments.databinding.FragmentListBinding

class ListFragment : Fragment() {

    /** Vinculacao usando o binding Passo 01:
     */
    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!
    //Proximo passo dentro da oncreateview

    private val TAG = "Fragment"



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_list, container, false)
        /** Vinculacao usando binding Passo 02:
         * */
        _binding = FragmentListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
        //Proximo passo na onDestroyView
    }
    /**
     * Eh chamado ma fase final de limpeza antes do fragment ser destruida.
     * ao final o layout e removido
     * */
    override fun onDestroyView() {
        super.onDestroyView()
        // vinculacao usando binding Passo 03:
        _binding = null
        // Fim da configuracao viewBinding
    }

    companion object {
        fun newInstance() = ListFragment()
    }
}