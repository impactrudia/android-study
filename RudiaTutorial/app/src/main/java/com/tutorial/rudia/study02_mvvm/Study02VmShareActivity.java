package com.tutorial.rudia.study02_mvvm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tutorial.rudia.R;

/**
 * 하나의 화면에서 두개의 프래그먼트를 사용하고 binding을 이용하여 seekbar 같이 움직이게 구현
 * tutorial url : https://www.youtube.com/watch?v=Y-uPcwBEEV4&t=906s
 */
public class Study02VmShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study02_vm_share);
    }
}
