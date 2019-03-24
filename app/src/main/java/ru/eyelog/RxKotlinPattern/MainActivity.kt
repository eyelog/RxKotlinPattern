package ru.eyelog.RxKotlinPattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.eyelog.RxKotlinPattern.Flowable.FlowableActivity
import ru.eyelog.RxKotlinPattern.Observable.ObservableActivity
import ru.eyelog.RxKotlinPattern.Single.SingleActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSingle.setOnClickListener {
            val intent = Intent(this, SingleActivity::class.java)
            startActivity(intent)
        }

        btObservable.setOnClickListener {
            val intent = Intent(this, ObservableActivity::class.java)
            startActivity(intent)
        }

        btSingle.setOnClickListener {
            val intent = Intent(this, FlowableActivity::class.java)
            startActivity(intent)
        }
    }
}
