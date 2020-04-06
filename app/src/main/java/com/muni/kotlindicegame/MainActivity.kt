package com.muni.kotlindicegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
lateinit var im:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        im=findViewById(R.id.img)
    }

    fun showToast(view: View) {
        //range
        val r=(1..6).random()
        val tv:TextView=findViewById(R.id.result)//fro getting id
        tv.text=r.toString()
        displayDic(r)
        /*val toast:Toast=Toast.makeText(this,"Random numner is "+r,Toast.LENGTH_SHORT)
        toast.show()*/

    }

    private fun displayDic(r: Int) {
        when(r){
            1->im.setImageResource(R.drawable.dice_1)
            2->im.setImageResource(R.drawable.dice_2)
            3->im.setImageResource(R.drawable.dice_3)
            4->im.setImageResource(R.drawable.dice_4)
            5->im.setImageResource(R.drawable.dice_5)
            6->im.setImageResource(R.drawable.dice_6)
            else->{
                im.setImageResource(R.drawable.empty_dice)
            }
        }
    }

    fun showGameActivity(view: View) {
        val intent=Intent(this,AssignmentActivity::class.java)
        startActivity(intent)

    }

}
