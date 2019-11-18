package com.taweesak.mvvmdemo.ui.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.taweesak.mvvmdemo.R
import com.taweesak.mvvmdemo.ui.BaseActivity

class MainActivity : BaseActivity() {

    // Extend MainFragment
    private val fragment: MainFragment by lazy { // lary = ประกาศรอไว้เฉย
        MainFragment.newInstance()
    }
    // https://medium.com/i-patipan/%E0%B8%9E%E0%B8%B7%E0%B9%89%E0%B8%99%E0%B8%90%E0%B8%B2%E0%B8%99-fragment-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-3-newinstance-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%88%E0%B8%9A-59ab6aceb2f9

    //http://www.akexorcist.com/2017/05/lets-fragment-best-way-to-create-fragment-instance.html
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit()
        }
    }
}

//TestGit
//TestGit2
//TestGit3
