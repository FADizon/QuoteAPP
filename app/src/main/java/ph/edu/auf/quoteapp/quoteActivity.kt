@file:Suppress("UNUSED_EXPRESSION")

package ph.edu.auf.quoteapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class QuoteActivity: AppCompatActivity() {
    private lateinit var quoteTextView: TextView
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quoteTextView = findViewById(R.id.quoteText)
        saveButton = findViewById(R.id.saveButton)

        val quote = when (intent.getStringExtra("quoteType")){
            "Motivational" -> arrayOf("Success is not final; failure is not fatal: It is the courage to continue that counts.— Winston S. Churchill",
                "Develop success from failures. Discouragement and failure are two of the surest stepping stones to success. —Dale Carnegie",
                "There are three ways to ultimate success: The first way is to be kind. The second way is to be kind. The third way is to be kind. —Mister Rogers",
                "Success is peace of mind, which is a direct result of self-satisfaction in knowing you made the effort to become the best of which you are capable. —John Wooden",
                "If you are working on something that you really care about, you don’t have to be pushed. The vision pulls you. — Steve Jobs")
            "Love" -> arrayOf(  "Thinking of you keeps me awake. Dreaming of you keeps me asleep. Being with you keeps me alive.",
                "What we have once enjoyed we can never lose. All that we love deeply becomes a part of us.",
                "Of all forms of caution, caution in love is perhaps the most fatal to true happiness.",
                "Loved you yesterday, love you still, always have, always will.",
                "To love well is the task in all meaningful relationships, not just romantic bonds.")
            else -> arrayOf()

        }

        val randomIndex = Random.nextInt(quote.size)
        val randomQuote = quote[randomIndex]


        quoteTextView.text = randomQuote

        saveButton.setOnClickListener {
            randomQuote




        }


        }

    }
