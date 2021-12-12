package kg.hello.buyh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Tovary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tovary)
        val imageView = findViewById<ImageView>(R.id.search_but)

        imageView.setOnClickListener {
            startActivity(Intent(this, Shop::class.java))
        }
    }
}