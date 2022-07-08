package com.bignerdranch.android.criminalintent

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class CrimeListFragment: Fragment() {
    private val crimeListViewModel: CrimeListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }
}