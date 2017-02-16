package org.diql.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user = User("kotlin", "1111")
        var user1 : User;
        tv.text = user.id
        tv.textSize = 30f;
        println(sum(30, 20))
        Log.v("lal", "lalala")
        sum2(19, 20)
        user?.id
        btn.setOnClickListener { it -> Main2Activity.start(this@MainActivity) }
    }

    fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    fun sum2(a: Int, b: Int) {
        Log.v("lalla", "as$a,$b ")
    }
}
