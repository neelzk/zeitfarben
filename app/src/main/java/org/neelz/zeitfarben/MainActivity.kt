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
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val cl = findViewById<ConstraintLayout>(R.id.clayout)

        if (hour < 2 || hour > 5) {
            cl.setBackgroundColor(Color.RED)
        } else if (hour < 3) {
            cl.setBackgroundColor(Color.BLUE)
        } else {
            cl.setBackgroundColor(Color.GREEN)
        }
    }
}
