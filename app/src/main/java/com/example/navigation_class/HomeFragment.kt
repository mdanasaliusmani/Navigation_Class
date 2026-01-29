package com.example.navigation_class

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onResume() {
        super.onResume()
        activity?.title = "Home"
    }
}