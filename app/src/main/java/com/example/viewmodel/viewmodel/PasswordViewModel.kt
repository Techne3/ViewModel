package com.example.viewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// Lives through orientation changes
// holds data and ui logic
// Can share data between fragments
// VM part of MVVM

class PasswordViewModel: ViewModel() {

    private var _password: MutableLiveData<String> = MutableLiveData()
    val password: LiveData <String> get() = _password



    val passwordAuthentication = object {
        val lengthAuth = false
        val capAuth = false
        val spaceAuth = false
        val numberAuth = false
    }
}