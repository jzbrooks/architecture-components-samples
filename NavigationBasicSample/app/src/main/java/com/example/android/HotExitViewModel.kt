package com.example.android

import android.util.Log
import androidx.lifecycle.ViewModel

class HotExitViewModel : ViewModel() {
    fun log() {
        Log.d("HotExitViewModel", "Wassup")
    }

    override fun onCleared() {
        Log.d("HotExitViewModel", "Cleared")
        super.onCleared()
    }
}