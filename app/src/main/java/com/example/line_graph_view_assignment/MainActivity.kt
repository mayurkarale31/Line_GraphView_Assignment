package com.example.line_graph_view_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var lineGraphView : LineGraphView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViews()

        lineGraphView.values = arrayOf(60, 90, 50, 80, 40, 70)


    }
    private fun initViews(){
        setContentView(R.layout.activity_main)
        lineGraphView = findViewById(R.id.lineGraphView)
    }
}