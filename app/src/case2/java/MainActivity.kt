package com.roger.androidxlifecycle_practise

import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.Lifecycle

class MainActivity : Activity() {
    private var myLifecycleOwner: MyLifecycleOwner = MyLifecycleOwner()

    init {
        val myObserver = MyObserver()
        myLifecycleOwner.lifecycle.addObserver(myObserver)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_CREATE)
    }

    override fun onStart() {
        super.onStart()
        myLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_START)
    }

    override fun onResume() {
        super.onResume()
        myLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
    }

    override fun onPause() {
        super.onPause()
        myLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    }

    override fun onStop() {
        super.onStop()
        myLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_STOP)
    }

    override fun onDestroy() {
        super.onDestroy()
        myLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    }
}