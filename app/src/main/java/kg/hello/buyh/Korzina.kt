package kg.hello.buyh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Korzina : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korzina)
        val button = findViewById<Button>(R.id.go_to)

        button.setOnClickListener {
            startActivity(Intent(this, Tovary::class.java))
        }
    }
}