package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    companion object {
        val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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


}