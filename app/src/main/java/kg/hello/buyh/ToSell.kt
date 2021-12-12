package kg.hello.buyh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ToSell : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_sell)
        val button = findViewById<Button>(R.id.findclients)

        button.setOnClickListener {
            startActivity(Intent(this, Korzina::class.java))
        }
    }
}