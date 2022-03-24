package com.example.android.databinding.basicsample.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.databinding.basicsample.databinding.ItemUserLayoutBinding
import com.example.android.databinding.basicsample.model.User

class UserAdapter(
    private val onLikeClicked: (List<User>) -> Unit,
    private val onUnLikeClicked: (User) -> Unit
) : ListAdapter<User, UserAdapter.UserViewHolder>(diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            ItemUserLayoutBinding.inflate(LayoutInflater.from(parent.context)),
            onLikeClicked,
            onUnLikeClicked
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class UserViewHolder(
        private var binding: ItemUserLayoutBinding,
        private val onLikeClicked: (List<User>) -> Unit,
        private val onUnLikeClicked: (User) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: User) {
            binding.item = item
            binding.likes.text = item.likeCount.toString()
            binding.likeButton.setOnClickListener {
                item.likeCount += 1
                binding.likes.text = item.likeCount.toString()
                onLikeClicked.invoke(mutableListOf(item))
            }
            binding.likeButtonDown.setOnClickListener {
            }
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<User>() {
            override fun areItemsTheSame(oldItem: User, newItem: User): Boolean = oldItem == newItem


            override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }
}