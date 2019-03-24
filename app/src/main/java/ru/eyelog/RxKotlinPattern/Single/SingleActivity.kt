package ru.eyelog.RxKotlinPattern.Single

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.Single
import kotlinx.android.synthetic.main.activity_fragment.*
import ru.eyelog.RxKotlinPattern.R

class SingleActivity : AppCompatActivity() {

    private val TAG = "Logcat Single"

    lateinit var sigleNumbersGenerator : SigleNumbersGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        sigleNumbersGenerator = SigleNumbersGenerator()

        button.setOnClickListener {
            Single.just(sigleNumbersGenerator.generate(etText.text.toString().toInt()))
                .subscribe(
                    {
                        tvText.text = it.toString()
                    },{
                        Log.e(TAG, it.toString())
                    }
                )
        }
    }
}