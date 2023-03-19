package com.example.reservationapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel() {
    private val _score = MutableLiveData(0)
    val score: LiveData<Int>
        get() = _score

    fun increaseScore() {
        _score.value = _score.value?.plus(1)
        Log.d("ButtonLog", "１増える:${_score.value}")
    }

    fun decreaseScore() {
        _score.value = _score.value?.minus(1)
        Log.d("ButtonLog", "１減る:${_score.value}")
    }
}