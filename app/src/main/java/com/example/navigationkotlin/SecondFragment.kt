package com.example.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationkotlin.databinding.FragmentFirstBinding
import com.example.navigationkotlin.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var tasarim: FragmentSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentSecondBinding.inflate(inflater,container,false)

        tasarim.button2.setOnClickListener{
            val gecis = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root

       // return inflater.inflate(R.layout.fragment_second, container, false)
    }
    /*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments.let {
        }
    }

     */
}