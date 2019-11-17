package com.taweesak.mvvmdemo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.taweesak.mvvmdemo.R
import com.taweesak.mvvmdemo.ui.BaseFragment
import kotlinx.android.synthetic.main.activity_fragment.*
// extend BaseFragment
class MainFragment(
) : BaseFragment() {

    private lateinit var viewModel: MainViewModel

    private lateinit var rootView: View

    companion object {
        //        fun newInstance(viewModel: MainViewModel): MainFragment {
        //            return MainFragment(viewModel)
        //        }
        fun newInstance() = MainFragment()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(activity!!).get(MainViewModel::class.java)

        initObserver()
        initEventListener()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.activity_fragment, container, false)
        return rootView
    }

    private fun initEventListener() {
        //input event from user
        btnIncrementCount.setOnClickListener {
            viewModel.incrementCount()
        }

        btnReset.setOnClickListener {
            viewModel.resetCount()
        }
    }

    private fun initObserver() {
        //on data changed -> update view (rootView)
        viewModel.count.observe(this, Observer { counter ->
            tvCounter.text = "$counter"
        })
    }

}