package com.tutorial.rudia.study02_mvvm.fragment;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.tutorial.rudia.R;
import com.tutorial.rudia.databinding.FragmentSeekBarBinding;
import com.tutorial.rudia.study02_mvvm.vo.VmShareViewModel;

public class SeekBarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_seek_bar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentSeekBarBinding binding = DataBindingUtil.bind(view);
        binding.setLifecycleOwner(requireActivity());

        VmShareViewModel viewModel = ViewModelProviders.of(requireActivity()).get(VmShareViewModel.class);
        binding.setViewModel(viewModel);

        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                viewModel.progress.setValue(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

////      replace xml Databinding
//        viewModel.progress.observe(getViewLifecycleOwner(), progress -> {
//            binding.seekBar.setProgress(progress);
//        });
    }
}
