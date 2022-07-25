package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data
        val p1 = Products("Computer", 65000.0, 40, R.drawable.image_1)
        val p2 = Products("Clothes", 1500.0, 15, R.drawable.image_2)
        val p3 = Products("Shoes", 2300.0, 32, R.drawable.image_3)
        val p4 = Products("Belts", 900.0, 12, R.drawable.image_4)
        val p5 = Products("Cars", 3000345.0, 6, R.drawable.image_5)
        val p6 = Products("Medicine", 365.0, 40, R.drawable.image_6)
        val p7 = Products("Laptops", 45000.0, 4, R.drawable.image_8)
        val p8 = Products("Phones", 11200.0, 40, R.drawable.image_9)
        val p9 = Products("Jacket", 6500.0, 12, R.drawable.image_10)

        val products = arrayListOf<Products>(p1, p2, p3, p4, p5, p6, p7, p8, p9)

        val recyclerProducts: RecyclerView = findViewById(R.id.recyclerProducts)
        recyclerProducts.layoutManager = LinearLayoutManager(this)
        val customAdapter = CustomAdapter(products)

        recyclerProducts.adapter = customAdapter

    }
}