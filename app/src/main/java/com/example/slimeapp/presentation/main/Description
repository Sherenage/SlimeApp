package com.example.slime.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.slimeapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_description.*

class Description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        name.text = getIntent().getStringExtra("name")

        Picasso.get().load(getIntent().getStringExtra("image")).into(image)
        Picasso.get().load(getIntent().getStringExtra("description")).into(description)

    }
}
