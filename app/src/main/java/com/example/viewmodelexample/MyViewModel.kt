package com.example.viewmodelexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel()
{
    var counter = MutableLiveData<Int>()      //use Live Data, by default: nullable

    fun add(){
        val count = counter.value ?:0   //存取live data的方式 （XXX.value)
        counter.value = count + 1
    }

    fun reset(){
        counter.value = 0
    }

}