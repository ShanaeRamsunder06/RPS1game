package my.rpsgame

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //declare
    private lateinit var resultTextView: TextView
    private lateinit var rock: Button
    private lateinit var paper: Button
    private lateinit var scissors:Button
    private lateinit var computerChoice: ImageView



    @SuppressLint("MissingInflatedId", "SuspiciousIndentation", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

       //initialise
        resultTextView=findViewById(R.id.resultTextView)
        rock=findViewById(R.id.rock)
        paper=findViewById(R.id.paper)
        scissors=findViewById(R.id.scissors)
        computerChoice=findViewById(R.id.computerChoice)

        resultTextView.text="game start"


       rock.setOnClickListener {
       computerChoice.setImageResource(R.drawable.paper)
       resultTextView.text="you lose"

           paper.setOnClickListener {
               computerChoice.setImageResource(R.drawable.rock)
           resultTextView.text="you win"

           scissors.setOnClickListener {
               computerChoice.setImageResource(R.drawable.scissors)
            resultTextView.text="its a tie"

                   }
               }




            }
           }
       }


