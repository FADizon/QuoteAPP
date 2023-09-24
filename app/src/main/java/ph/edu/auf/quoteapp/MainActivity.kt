package ph.edu.auf.quoteapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var motivationalButton: Button
    private lateinit var loveButton: Button
    private lateinit var happinessButton: Button
    private lateinit var favoritesButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        motivationalButton = findViewById(R.id.motivationalButton)
        happinessButton = findViewById(R.id.happinessButton)
        loveButton = findViewById(R.id.loveButton)
        favoritesButton = findViewById(R.id.favoritesButton)


        motivationalButton.setOnClickListener {
            startQuoteActivity("Motivational")
        }
        happinessButton.setOnClickListener {
            startQuoteActivity("Happiness")
        }
        loveButton.setOnClickListener {
            startQuoteActivity("Love")
        }


    }


    private fun startQuoteActivity(quoteType: String) {
        val intent = Intent(this, QuoteActivity::class.java)
        intent.putExtra("quoteType", quoteType)
        startQuoteActivity(intent)
    }

    private fun startQuoteActivity(quoteType: Intent) {

    }
}