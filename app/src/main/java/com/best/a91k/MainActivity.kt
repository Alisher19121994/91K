package com.best.a91k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openD()
    }

    private fun openD() {
        imageView = findViewById(R.id.image_ID)
        val button: Button = findViewById(R.id.button_ID)
        button.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.bounce)
            imageView.startAnimation(animation)
        }
    }
}