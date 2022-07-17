package com.roger.androidxlifecycle_practise

import androidx.annotation.NonNull
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

class MyLifecycleOwner: LifecycleOwner {
    private var lifecycleRegistry = LifecycleRegistry(this)

    fun handleLifecycleEvent(@NonNull event: Lifecycle.Event) {
        lifecycleRegistry.handleLifecycleEvent(event)
    }

    override fun getLifecycle(): Lifecycle {
        return lifecycleRegistry
    }
}