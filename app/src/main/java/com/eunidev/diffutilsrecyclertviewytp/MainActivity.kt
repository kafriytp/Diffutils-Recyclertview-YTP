package com.eunidev.diffutilsrecyclertviewytp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
	
	private val oldList = populateData()
	private val newList = populateData2()
	
	private lateinit var rvAdapter: RVAdapter
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
		setContentView(R.layout.activity_main)
		
		with(findViewById<RecyclerView>(R.id.rv_MainActivity)) {
			rvAdapter = RVAdapter(oldList)
			layoutManager = LinearLayoutManager(this@MainActivity)
			adapter = rvAdapter
		}
	}
	
	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		menuInflater.inflate(R.menu.menu_main, menu)
		
		return true
	}
	
	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		when (item.itemId) {
			R.id.addNewItem_MenuMain -> {
				rvAdapter.updateList(newList)
			}
		}
		
		return true
	}
	
	private fun populateData(): ArrayList<PhoneModel> {
		val listOld = ArrayList<PhoneModel>()
		listOld.add(PhoneModel(Random.nextInt(), "Google", "Pixel 5"))
		listOld.add(PhoneModel(Random.nextInt(), "Google", "Pixel 3a XL"))
		listOld.add(PhoneModel(Random.nextInt(), "Xiaomi", "Mi 11X"))
		listOld.add(PhoneModel(Random.nextInt(), "Xiaomi", "Black Shark 4"))
		listOld.add(PhoneModel(Random.nextInt(), "Xiaomi", "Redmi Note 8"))
		listOld.add(PhoneModel(Random.nextInt(), "Vivo", "V21 5G"))
		listOld.add(PhoneModel(Random.nextInt(), "Vivo", "Y30G"))
		listOld.add(PhoneModel(Random.nextInt(), "Vivo", "X60 Pro"))
		listOld.add(PhoneModel(Random.nextInt(), "Vivo", "Y31s"))
		listOld.add(PhoneModel(Random.nextInt(), "Huawei", "Y5p"))
		listOld.add(PhoneModel(Random.nextInt(), "Huawei", "Y8s"))
		
		listOld.add(PhoneModel(23, "Huawei", "Y6p"))
		
		listOld.add(PhoneModel(Random.nextInt(), "Realme", "C25"))
		listOld.add(PhoneModel(Random.nextInt(), "Realme", "7 Pro"))
		listOld.add(PhoneModel(Random.nextInt(), "Realme", "6 Pro"))
		
		return listOld
	}
	
	private fun populateData2(): ArrayList<PhoneModel> {
		val listOld = ArrayList<PhoneModel>()
		
		// Old Item
		listOld.add(PhoneModel(Random.nextInt(), "Google", "Pixel 5"))
		listOld.add(PhoneModel(Random.nextInt(), "Google", "Pixel 3a XL"))
		
		listOld.add(PhoneModel(23, "Xiaomi", "Mi 11X"))
		
		listOld.add(PhoneModel(Random.nextInt(), "Xiaomi", "Black Shark 4"))
		listOld.add(PhoneModel(Random.nextInt(), "Xiaomi", "Redmi Note 8"))
		
		// New Item
		listOld.add(PhoneModel(Random.nextInt(), "Oppo", "Find X3 (new item)"))
		listOld.add(PhoneModel(Random.nextInt(), "Samsung", "Galaxy A72 (new item)"))
		listOld.add(PhoneModel(Random.nextInt(), "Apple", "iPhone 12 Pro (new item)"))
		
		return listOld
	}
}