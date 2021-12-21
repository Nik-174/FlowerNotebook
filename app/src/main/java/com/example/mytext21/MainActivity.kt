package com.example.mytext21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mytext21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = PlantAdapter()
    private val imageIdList = listOf(R.drawable.flo1,
        R.drawable.flo2,
        R.drawable.flo3,
        R.drawable.flo4,
        R.drawable.flo5)

    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()


    }

private fun init(){
    binding.apply {
        rcView.layoutManager = GridLayoutManager(this@MainActivity,3)
        rcView.adapter = adapter
        button.setOnClickListener {
            if(index>4)index = 0
            val plant = Plant(imageIdList[index],"flo $index")

            adapter.appPlant(plant)
            index++
        }
    }

}






}