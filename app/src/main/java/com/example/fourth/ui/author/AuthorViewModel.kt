package com.example.fourth.ui.author

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AuthorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is list of author"
    }
    val text: LiveData<String> = _text
}