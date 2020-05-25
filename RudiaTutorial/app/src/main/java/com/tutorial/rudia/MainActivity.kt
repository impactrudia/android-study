package com.tutorial.rudia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tutorial.rudia.study01_spinner.Study01CustomSpinnerActivity
import com.tutorial.rudia.study02_mvvm.Study02MvvmActivity
import com.tutorial.rudia.study02_mvvm.Study02VmShareActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStudy01.setOnClickListener {
            startActivity(Intent(this, Study01CustomSpinnerActivity::class.java));
        }
        btnStudy02MVVM.setOnClickListener {
            startActivity(Intent(this, Study02MvvmActivity::class.java));
        }
        btnStudy02VmShare.setOnClickListener {
            startActivity(Intent(this, Study02VmShareActivity::class.java));
        }
    }
}
