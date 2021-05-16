package com.eunidev.diffutilsrecyclertviewytp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(var list: ArrayList<PhoneModel>): RecyclerView.Adapter<RVAdapter.ViewHolder>() {
	
	inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
		val tvName = itemView.findViewById<TextView>(R.id.tvName_CustomRVLayout)
		val tvBrand = itemView.findViewById<TextView>(R.id.tvBrand_CustomRVLayout)
		
		fun bind(model: PhoneModel) {
			tvName.text = model.name
			tvBrand.text = model.brand
		}
	}
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_rv_layout, parent, false))
	}
	
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bind(list[position])
	}
	
	override fun getItemCount(): Int = list.size
	
	fun updateList(newList: ArrayList<PhoneModel>) {
		val diffResult = DiffUtil.calculateDiff(DiffCallback(list, newList))
		list.addAll(newList)
		diffResult.dispatchUpdatesTo(this)
	}
	
}