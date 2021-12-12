package kg.hello.buyh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Shop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)
        val imageView = findViewById<ImageView>(R.id.homeicon)

        imageView.setOnClickListener {
            startActivity(Intent(this, Tovary::class.java))
        }

        val imageView2 = findViewById<ImageView>(R.id.korzinaicon)

        imageView.setOnClickListener {
            startActivity(Intent(this, Tovary::class.java))
        }
    }
}