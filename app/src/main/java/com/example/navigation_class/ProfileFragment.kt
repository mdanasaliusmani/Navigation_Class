package com.example.navigation_class

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
class ProfileFragment : Fragment(R.layout.fragment_profile) {
    override fun onResume() {
        super.onResume()
        activity?.title = "Profile"
    }
}