package com.tutorial.rudia.study02_mvvm.vo;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class VmShareViewModel extends ViewModel {
    public MutableLiveData<Integer> progress = new MutableLiveData<>();

}
