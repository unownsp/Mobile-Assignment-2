package com.saugat.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.saugat.dinnerdecider.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val foodList = ArrayList<String>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        foodList.add("Hamburger")
        foodList.add("Pizza")
        foodList.add("American")
        foodList.add("Chinese")

        binding.addFood.setOnClickListener {
            val text = binding.newFoodET.editableText.toString()
            foodList.add(text)
            binding.newFoodET.text.clear()
        }

        binding.decide.setOnClickListener {
            val number = Random.nextInt(foodList.size)
            val text = foodList[number]
            binding.decidedText.text = text
        }
    }
}