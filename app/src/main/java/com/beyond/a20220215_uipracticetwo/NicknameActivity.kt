package com.beyond.a20220215_uipracticetwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nickname.*

class NicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nickname)

        btn_Intent_Nick.setOnClickListener {

            var Nickname = EDT_Nick.text.toString()

            val resultIntent = Intent() // 결과 담을거니까, 굳이 도착지 표시 안해줘도 됨
            //데이터를 putExta로 담아야함

            resultIntent.putExtra("nick", Nickname)

            //복귀 결과로 최종 세팅해줘야 됨
            //실제로 확인을 누른 게 맞다 + 돌고 돌아갈 데이터
            setResult(RESULT_OK, )

        }


    }
}