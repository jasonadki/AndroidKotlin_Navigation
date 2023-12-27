package com.example.navigation_app

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class EditProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("EditProfileFragment", "Loading Edit Profile Page")
        return inflater.inflate(R.layout.fragment_edit_profile, container, false)
    }
}
