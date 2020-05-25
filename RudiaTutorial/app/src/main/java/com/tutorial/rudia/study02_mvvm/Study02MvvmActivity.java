package com.tutorial.rudia.study02_mvvm;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tutorial.rudia.R;
import com.tutorial.rudia.databinding.ActivityStudy02MvvmBinding;
import com.tutorial.rudia.study02_mvvm.vo.CounterViewModel;

/**
 * livedata와 binding을 이용하여 view 자동 업데이트
 * tutorial url : https://www.youtube.com/watch?v=Y-uPcwBEEV4&t=906s
 */
public class Study02MvvmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityStudy02MvvmBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_study02_mvvm);
//        binding.counterTextView.setText("0");

        CounterViewModel viewModel = ViewModelProviders.of(this).get(CounterViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);

//        binding.counterTextView.setText(String.valueOf(viewModel.counter));
//        binding.fabAdd.setOnClickListener(v -> {
//            viewModel.increase();
////            binding.counterTextView.setText(String.valueOf(viewModel.counter));
//        });
//        binding.fabRemove.setOnClickListener(v -> {
//            viewModel.decrease();
////            binding.counterTextView.setText(String.valueOf(viewModel.counter));
//        });
//        viewModel.counter.observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(@Nullable Integer integer) {
//                //UI 업데이트
//                binding.counterTextView.setText(integer+"");
//            }
//        });
    }
}
