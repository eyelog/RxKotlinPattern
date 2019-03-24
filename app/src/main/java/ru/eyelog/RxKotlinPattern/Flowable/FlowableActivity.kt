package ru.eyelog.RxKotlinPattern.Flowable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fragment.*
import ru.eyelog.RxKotlinPattern.R

class FlowableActivity : AppCompatActivity(){

    private val TAG = "Logcat Flowable"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)


        button.setOnClickListener {

        }
    }
}