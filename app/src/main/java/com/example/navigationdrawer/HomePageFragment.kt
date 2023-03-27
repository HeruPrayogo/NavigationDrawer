package com.example.navigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawer.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {
    lateinit var binding: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentHomePageBinding.inflate(layoutInflater, container, false)

        return binding.root
    }


}