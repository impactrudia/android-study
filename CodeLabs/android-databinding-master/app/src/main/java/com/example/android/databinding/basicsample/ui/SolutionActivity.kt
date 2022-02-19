/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.databinding.basicsample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.data.SimpleViewModelSolution
import com.example.android.databinding.basicsample.databinding.SolutionBinding
import com.example.android.databinding.basicsample.model.User
import com.example.android.databinding.basicsample.ui.adapter.UserAdapter

/**
 * Final codelab solution.
 */
class SolutionActivity : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModelSolution::class.java)
    }

    private val adapter by lazy {
        UserAdapter({
        }, {
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: SolutionBinding =
            DataBindingUtil.setContentView(this, R.layout.solution)
        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments
        binding.viewmodel = viewModel

        binding.apply {
            recyclerView.adapter = adapter
            var list : MutableList<User> = mutableListOf<User>()
            list.add(User(1, "Moon", "HyeYoung", 0))
            list.add(User(2, "Moon", "HyeSun", 6))
            list.add(User(3, "Moon", "HyeJeong", 0))
            adapter.submitList(list)
        }
    }
}
