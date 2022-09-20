package com.example.stopwatch

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import java.lang.Boolean.FALSE
import java.lang.Boolean.TRUE

class MainActivity : AppCompatActivity() {
    lateinit var start : Button
    lateinit var reset : Button
    lateinit var stopwatch : Chronometer
    companion object {
        val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wireWidgets()
        var isworking = FALSE
        var time = 0.toLong()

        start.setOnClickListener {
            if(!isworking){
                stopwatch.start()
                isworking = TRUE
                start.setText("stop")
                stopwatch.base = SystemClock.elapsedRealtime() - time


            } else {
                stopwatch.stop()
                isworking= FALSE
                start.setText("start")
                time = SystemClock.elapsedRealtime() - stopwatch.base

            }


        }
        reset.setOnClickListener {
            stopwatch.setBase(SystemClock.elapsedRealtime());
            time=0
            stopwatch.stop();
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: restarted")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: destroyed")
    }
    private fun wireWidgets(){
        start = findViewById(R.id.button_main_start)
        reset = findViewById(R.id.Reset)
        stopwatch = findViewById(R.id.chronometer_main_stopwatch)
    }

}