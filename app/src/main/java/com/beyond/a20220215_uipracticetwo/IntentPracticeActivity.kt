package com.beyond.a20220215_uipracticetwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_practice.*

class IntentPracticeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_practice)

        var k = intent.getStringExtra("K").toString()

        if(k != ""){ T2.setText(k)}
       else if(k==""){
            val T = "에딧텍스트에 문장을 써주세요"
            T2.setText(T)
        }

        backToMainBtn.setOnClickListener {
//            val i = Intent(this,MainActivity::class.java)
//            startActivity(i)
            finish()
            //돌아가는 경우에는 그냥 finish 누르면 됨
        }

    }
}