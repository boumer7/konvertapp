package com.example.konvertapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_input_fullscreen.*
import kotlinx.android.synthetic.main.activity_main.*

class InputFullscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_fullscreen)

        backbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            var FromInputFullscreenActivity = InputFullscreenActivity.text.toString()

            intent.putExtra("FromInputFullscreenActivity",FromInputFullscreenActivity)

            startActivity(intent)

            overridePendingTransition(R.anim.slide_in,R.anim.slide_out)



        }

        var UntouchedInput = intent.getStringExtra("UntouchedInput")

        InputFullscreenActivity.setText(UntouchedInput)



    }
}
