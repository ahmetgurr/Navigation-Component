package com.example.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.navigationkotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var tasarim:FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentFirstBinding.inflate(inflater,container,false)

        tasarim.button.setOnClickListener{
            val gecis = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root
        //return inflater.inflate(R.layout.fragment_first, container, false)
       // val view = inflater.inflate(R.layout.fragment_first,container,false)
        //return view
    }
/*
//  fragmentler arasında geçişi bu kod sayesinde yapıyoruz onCreateView içinde yazmaktan daha saglıklı
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myButton: Button = view.findViewById(R.id.button)
        button.setOnClickListener{
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
 */

}