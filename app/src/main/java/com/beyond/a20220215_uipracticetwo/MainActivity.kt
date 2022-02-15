package com.beyond.a20220215_uipracticetwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Intent1.setOnClickListener {

            val intent = Intent(this, IntentPracticeActivity::class.java)
            startActivity(intent)
//            finish()
            //누를 때 마다 새 화면을 만들어서 덧씌우는 기능, 이 화면을 닫고 다음 화면을 열고 싶을 경우 finish()실행

        }

        btn_Intent2.setOnClickListener {

            var K = EDT1.text.toString()

            val intent = Intent(this, IntentPracticeActivity::class.java)
            intent.putExtra("K", K.toString())
            startActivity(intent)

//            finish()
            //누를 때 마다 새 화면을 만들어서 덧씌우는 기능, 이 화면을 닫고 다음 화면을 열고 싶을 경우 finish()실행

        }



    }
}