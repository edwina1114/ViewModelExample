package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var ViewModel : MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        //////呼叫ViewModel,可防止翻轉螢幕時使程式終止//////
        ViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.viewModel = ViewModel    //直接參考xml裡面的data binding,直接由xml來控制counter
        binding.lifecycleOwner = this
        //////呼叫ViewModel,可防止翻轉螢幕時使程式終止//////

/** 直接由xml來控制(use ViewModel)
//        binding.BTNAdd.setOnClickListener {
//            ViewModel.add()
//            //binding.TVShow.text = ViewModel.count.toString()
//        }
//
//        binding.BTNReset.setOnClickListener {
//            ViewModel.reset()
//            //binding.TVShow.text = ViewModel.count.toString()
//        }
*/
    }


}