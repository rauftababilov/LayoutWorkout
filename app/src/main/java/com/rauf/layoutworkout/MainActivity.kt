package com.rauf.layoutworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.rauf.layoutworkout.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainBinding.button.setOnClickListener{changeText()}

        button.setOnClickListener{changeText()}
    }

    private fun changeText() {
        val myTextView: TextView = findViewById(R.id.textView)

        activityMainBinding.textView.text = "Data binding"
    }
}
