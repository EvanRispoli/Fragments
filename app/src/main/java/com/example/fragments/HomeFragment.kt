package com.example.fragments

import android.content.Context
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    /** Vinculacao usando o binding Passo 01:
     */
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    //Proximo passo dentro da oncreateview

    private val TAG = "Fragment"
    /**
     *  Esse e o ponto onde seu fragmento se torna ligado a activity en que e usado.
     * Isso te permite referenciar a activitu, nesse momento nem a activity nem o fragmento
     * foram completamente craidos.
     */

    override fun onAttach(context: Context){
        super.onAttach(context)
        Log.i(TAG, "onAttach")
    }

    /**
     * Aqui e onde voce faz a inicializacao do seu fragment.
     * Nao e onde voce configura o layour, ainda nao existe IU disponivel para mostrar e nao tem
     * setContentView como na activity.
     */

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")
    }

    /**
     * e qqui onde vc cria o lauout do seu fragment.
     * o mais importante e lembrar que aqui em vez de voce configurar o layout, o fragmento vai
     * retornar um layout view. As views criadas estao desponiveis para serem referenciadas aqui.
     * */



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.i(TAG, "onCreateView")
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)

        /** Vinculacao usando binding Passo 02:
         * */
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
        //Proximo passo na onDestroyView
    }

    /**
     * Esse callback e o que esta entre o seu fragment estar totalmente criado e ser visivel
     * ao usuario. E onde voce tioicamente configura suas views e adiciona qualquer funcionalidade
     * e interatividade a essas views.
     * */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "onViewCreated")
    }

    /**
     * Chamada imedeatamente apos oncreated da activity ser chamada. A maior parte da inicializacao
     * do estado da view do fragment vai estar feita. e e aqui o lugar para a ultima configuracao se
     * requerida
     * */

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(TAG, "onActivityCreated")
    }

    /**
     *  E quando o fragment esta pronto para se tornar visivel ao usuario mas ainda nao esta
     *  disponivel para interacao
     * */

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    /**
     * Ao final dessa chamada, seu fragment vai estar disponivel para a interacao com o usuario.
     * Normalmente, existe um minimo de configuracao ou funcionalidades definidas nesse callbackl
     * */
    override fun onResume(){
        super.onResume()
        Log.i(TAG, "onResume")

    }
    /**
     * E chamado quando vai para o plano de fundo ou e coberto por outro componente
     * */
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    /**
     * O fragmento nao e mais visivel ao final dessa chamada e vai para o plano de fundo.
     * */
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // vinculacao usando binding Passo 03:
        _binding = null
        // Fim da configuracao viewBinding
    }
    /**
     * Ocorre quando o fragmento e substituida por outro ou quando o app esta sendo morto
     * */
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

    /**
     * E chamado quando um fragment e desanexado da activity
     * */

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "onDetach")
    }

    companion object{
        fun newInstance() = HomeFragment()
    }

}