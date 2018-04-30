package com.pa.landmarkbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pa.landmarkbook.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //// intent receive from MainActivity
        val intent = intent

        //// retreive the intents from the MainActivity
        val name = intent.getStringExtra("name")
        textView.text = name


        val chosen = Globals.Chosen
        val selectedImage = chosen.returnImage()

        imageView.setImageBitmap(selectedImage)

    }
}
