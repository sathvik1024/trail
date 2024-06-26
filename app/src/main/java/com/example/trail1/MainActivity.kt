package com.example.trail1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.i(TAG,"activity is getting created")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"activity is started")
    }
    override fun onPause() {
        super.onPause()
        Log.w(TAG,"activity has paused")

    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG,"activity is stopped")

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG,"activity is destroyed")
    }


    fun myClickHandler(view: View) {
        Log.i("MainActivity","Button clicked")
       // var dialIntent:Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:987654398765"))
       // var webIntent :Intent = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"))
       // startActivity(webIntent)
       // startTimer(message = "motor", seconds = 3)

        var hIntent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("nkey","sathvik-android")
        startActivity(hIntent)

    }


    fun startTimer(message: String, seconds: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_LENGTH, seconds)
            putExtra(AlarmClock.EXTRA_SKIP_UI, true)
        }
            startActivity(intent)

    }

    fun inflateXml(){
        var nameEditText = EditText(this)
        nameEditText.setHint("enter ur name")
        var pwdEditText = EditText(this)
        pwdEditText.setHint("enter ur pass")
        var loginButton = Button(this)
        loginButton.setText("login")
    }

}