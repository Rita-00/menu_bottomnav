package com.example.fourth.ui.albums

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AlbumsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is album"
    }
    val text: LiveData<String> = _text
}