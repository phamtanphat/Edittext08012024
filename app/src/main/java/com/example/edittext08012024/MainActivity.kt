package com.example.edittext08012024

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var btnShowMessage: Button
    private lateinit var edtInputMessage: EditText
    private lateinit var txtMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Anh xa
        btnShowMessage = findViewById(R.id.button_show)
        edtInputMessage = findViewById(R.id.edit_text_message)
        txtMessage = findViewById(R.id.text_view_message)

//        handleData(fun(string1) {
//            Log.d("pphat", "Function ${this}")
//        })

//        handleData ("1") { string1 ->
//            Log.d("pphat", "Lambda Function ${this}")
//        }

        btnShowMessage.setOnClickListener(object : OnClickListener {
            override fun onClick(p0: View?) {

            }
        })

        btnShowMessage.setOnClickListener {

        }
    }

    fun handleData(text: String, callback: (String) -> Unit) {
        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            var message = "Success"
            callback(message)
        }
    }
}