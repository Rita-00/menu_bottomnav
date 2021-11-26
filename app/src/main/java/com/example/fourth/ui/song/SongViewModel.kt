package com.example.fourth.ui.song

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SongViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is list of song"
    }
    val text: LiveData<String> = _text
}