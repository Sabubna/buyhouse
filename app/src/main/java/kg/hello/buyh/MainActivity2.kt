package kg.hello.buyh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kg.hello.buyh.R.layout.mainactivity2

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            startActivity(Intent(this, Reklama::class.java))
        }
    }
}