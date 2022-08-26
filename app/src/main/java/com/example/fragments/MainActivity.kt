package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//0002
    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val listFragment = ListFragment.newInstance()

        binding.fabNext.setOnClickListener {
            replaceFragment(listFragment)
        }

       /* if (savedInstanceState == null){
            val mainFragment = HomeFragment.newInstance()
            val listFragment = ListFragment.newInstance()

            if (binding.fragmentContainerRight != null){
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragment_container_right, listFragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }*/
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}