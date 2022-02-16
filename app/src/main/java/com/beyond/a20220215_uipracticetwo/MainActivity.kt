package com.beyond.a20220215_uipracticetwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val RequestCode_Nickname = 1000

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

        btn_Intent3.setOnClickListener {

            var K = EDT2.text.toString()

            val intent = Intent(this, NicknameActivity::class.java)
            startActivityForResult(intent, RequestCode_Nickname)
            //결과를 얻어내려 가는 동작 -> 단순 이동 아님
            //frequest code -> 닉네임 받으러 간다는 신호값


//            finish()

        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        //결과 수신용 코드 - 종합 처리 창구

        //리퀘스트 코드 확인

        if (requestCode == RequestCode_Nickname){


                if(resultCode == RESULT_OK){


                    val new_Nickname = data?.getStringExtra("nick")

                    T3.text = new_Nickname





                }

        }



    }


}