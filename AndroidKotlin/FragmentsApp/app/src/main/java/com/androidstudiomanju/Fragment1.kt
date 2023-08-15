package com.androidstudiomanju

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.androidstudiomanju.fragmentsapp.R

class Fragment1 : Fragment() {
    // studying the fragment life cycle
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context,"onAttach() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context,"onCreate() is called",Toast.LENGTH_SHORT).show()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Toast.makeText(context,"onCreateView() is called",Toast.LENGTH_SHORT).show()
        return inflater.inflate(R.layout.fragment_1, container, false)

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(context,"onStart() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(context,"onResume() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(context,"onPause() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(context,"onStop() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(context,"onDestroyView() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(context,"onDestroy() is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(context,"onDetach() is called",Toast.LENGTH_SHORT).show()
    }
}