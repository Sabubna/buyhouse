package kg.hello.buyh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Razmestitezakaz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_razmestitezakaz)
        val button = findViewById<Button>(R.id.findcustomers)

        button.setOnClickListener {
            startActivity(Intent(this, Tovary::class.java))
        }
    }
}