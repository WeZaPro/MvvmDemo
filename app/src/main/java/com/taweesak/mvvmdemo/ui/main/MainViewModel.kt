package com.taweesak.mvvmdemo.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.taweesak.mvvmdemo.ui.BaseViewModel
//extend BaseViewModel
class MainViewModel : BaseViewModel() {

    private val _count: MutableLiveData<Int> = MutableLiveData<Int>().apply { postValue(0) }
    val count: LiveData<Int>
        get() = _count

    fun incrementCount(by: Int = 1) {
        _count.value = _count.value!! + by
    }

    fun resetCount() {
        _count.value = 0
    }

}