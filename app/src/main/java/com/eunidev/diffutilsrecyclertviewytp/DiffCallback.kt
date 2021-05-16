package com.eunidev.diffutilsrecyclertviewytp

import androidx.recyclerview.widget.DiffUtil

class DiffCallback(private val oldItem: ArrayList<PhoneModel>,
                   private val newItem: ArrayList<PhoneModel>): DiffUtil.Callback() {
	
	override fun getOldListSize(): Int = oldItem.size
	
	override fun getNewListSize(): Int = newItem.size
	
	override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
		return oldItem[oldItemPosition].id == newItem[newItemPosition].id
	}
	
	override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
		return oldItem[oldItemPosition].name == newItem[newItemPosition].name
	}
	
	override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
		return super.getChangePayload(oldItemPosition, newItemPosition)
	}
}