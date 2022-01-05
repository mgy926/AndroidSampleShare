package com.ymg.sample.presentation.extention

import androidx.lifecycle.MutableLiveData



fun <T : Any?> MutableLiveData<T>.default(initialValue: T) = apply { setValue(initialValue) }