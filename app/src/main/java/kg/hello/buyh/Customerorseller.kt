package kg.hello.buyh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Customerorseller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customerorseller)
        val button = findViewById<Button>(R.id.seller)

        button.setOnClickListener {
            startActivity(Intent(this, ToSell::class.java))
        }

    }
}