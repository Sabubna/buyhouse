package kg.hello.buyh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Reklama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reklama)
        val textView = findViewById<TextView>(R.id.katalog_but)

        textView.setOnClickListener {
            startActivity(Intent(this, Catalog::class.java))
        }
    }
}