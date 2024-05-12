package org.neelz.zeitfarben

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    override fun onResume() {
        super.onResume()
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR)
        findViewById<ConstraintLayout>(R.id.clayout).setBackgroundColor(Color.RED)

        if (hour < 1) {
            findViewById<ConstraintLayout>(R.id.clayout).setBackgroundColor(Color.CYAN)
        } else if (hour < 2) {
            findViewById<ConstraintLayout>(R.id.clayout).setBackgroundColor(Color.BLUE)
        } else if (hour < 3) {
            findViewById<ConstraintLayout>(R.id.clayout).setBackgroundColor(Color.GREEN)
        }
    }
}