package com.bignerdranch.android.criminalintent

import androidx.lifecycle.ViewModel
import java.util.*

class CrimeListViewModel: ViewModel() {
    val crimes = mutableListOf<Crime>()
    init {
        for (i in 0 until 100) {
            with(crimes) { add(i, Crime(UUID.randomUUID(),"Crime #$i", Date(), i%2 == 0)) }
        }
    }
}