package ru.eyelog.RxKotlinPattern.Observable

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.Observable
import io.reactivex.Single
import kotlinx.android.synthetic.main.activity_fragment.*
import ru.eyelog.RxKotlinPattern.R
import ru.eyelog.RxKotlinPattern.Single.SigleNumbersGenerator

class ObservableActivity : AppCompatActivity(){

    private val TAG = "Logcat Observable"

    lateinit var oservableNumbersGenerator : OservableNumbersGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        oservableNumbersGenerator = OservableNumbersGenerator()

        button.setOnClickListener {
            val lot = etText.text.toString().toInt()
            var a = 0
            var b = ""
            Observable.just(oservableNumbersGenerator.generate(lot))
                .subscribe(
                    {
                        for (i in 0..it.size-1){
                            a = a + it[i]
                            b += "$a" + "\n"
                        }
                        tvText.text = b
                    },
                    {
                        Log.e(TAG, it.toString())
                    }
                )
        }
    }
}