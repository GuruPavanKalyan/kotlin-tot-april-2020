package com.muni.kotlindicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_assignment.*
/*Please do the following assignments

For Dice Roller, Create two dices with the feature to roll them at once. Both the dices should show a value of their own.
Also, Create an upcount button, which when clicked updates both the dices by value 1.
If any dice has value 6, Nothing should happen.
If upcount button is clicked without rolling the dice, it should display 1.

Submit all your assignments keeping them in the github account.
Share the links to your repositories in the form shared to you.

Thanks*/
class AssignmentActivity : AppCompatActivity() {
    lateinit var p1_image: ImageView
    lateinit var p2_image: ImageView
    var scorep1=0
    var scorep2=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment)
        p1_image = findViewById(R.id.imgp1)
        p2_image = findViewById(R.id.imgp2)

    }
    fun assignmentEvent(view: View) {
        var r=(1..6).random()
        var r1=(1..6).random()
        displayDic(r)
        displayDicp2(r1)
    }
    //for player one



    fun play_player1(view: View) {
        val r = (1..6).random()
        val tv_p1: TextView = findViewById(R.id.resultp1)//fro getting id
        scorep1=r
        val tv_p1_totalScore:TextView =findViewById(R.id.player1_score)
        if (r!=6) {
            scorep1++
        }
        tv_p1_totalScore.text="Score "+scorep1.toString()
        tv_p1.text ="Dice "+ r.toString()
        displayDic(r)
    }

    private fun displayDic(r: Int) {
        when (r) {
            1-> imgp1.setImageResource(R.drawable.dice_1)
            2->imgp1.setImageResource(R.drawable.dice_2)
            3->imgp1.setImageResource(R.drawable.dice_3)
            4->imgp1.setImageResource(R.drawable.dice_4)
            5->imgp1.setImageResource(R.drawable.dice_5)
            6->imgp1.setImageResource(R.drawable.dice_6)
            else->{
                imgp1.setImageResource(R.drawable.empty_dice)
            }

        }
    }

    //for player two
    fun play_player2(view: View) {
        val r1 = (1..6).random()
        val tv_p2: TextView = findViewById(R.id.resultp2)//fro getting id
        val tv_p2_totalScore:TextView =findViewById(R.id.player2_score)
        scorep2=r1
        if (r1!=6) {
            scorep2++
        }
        tv_p2_totalScore.text="Score "+scorep2.toString()
        tv_p2.text = "Dice "+r1.toString()
        displayDicp2(r1)
    }
    private fun displayDicp2(r1: Int) {
        when (r1) {
            1 -> imgp2.setImageResource(R.drawable.dice_1)
            2 -> imgp2.setImageResource(R.drawable.dice_2)
            3 -> imgp2.setImageResource(R.drawable.dice_3)
            4 -> imgp2.setImageResource(R.drawable.dice_4)
            5 -> imgp2.setImageResource(R.drawable.dice_5)
            6 -> imgp2.setImageResource(R.drawable.dice_6)
            else -> {
                imgp2.setImageResource(R.drawable.empty_dice)
            }

        }
    }


}
