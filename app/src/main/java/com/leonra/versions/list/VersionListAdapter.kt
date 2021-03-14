package com.leonra.versions.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.leonra.versions.databinding.ListItemVersionBinding
import com.leonra.versions.model.Version

class VersionListAdapter : ListAdapter<Version, VersionListAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemVersionBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)

        holder.binding.apply {
            // TODO Bind me!
        }
    }

    class ViewHolder(
        val binding: ListItemVersionBinding,
    ) : RecyclerView.ViewHolder(binding.root)

    class DiffCallback : DiffUtil.ItemCallback<Version>() {

        override fun areItemsTheSame(oldItem: Version, newItem: Version): Boolean =
            oldItem.apiLevel == newItem.apiLevel

        override fun areContentsTheSame(oldItem: Version, newItem: Version): Boolean =
            oldItem == newItem
    }
}