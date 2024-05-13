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
        val cl = findViewById<ConstraintLayout>(R.id.clayout)
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)

        when (hour) {
            2 -> cl.setBackgroundColor(Color.BLUE)
            3 -> cl.setBackgroundColor(Color.GREEN)
            else -> cl.setBackgroundColor(Color.RED)
        }
    }
}
