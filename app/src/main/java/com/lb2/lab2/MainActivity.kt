package com.lb2.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var txt:EditText
    private lateinit var btn:Button
    private lateinit var view:TextView
    private var add:Int = 0
    private var a:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt=findViewById(R.id.txt)
        btn=findViewById(R.id.btn)
        view=findViewById(R.id.txtview)

        btn.setOnClickListener()
        {
           a= txt.text.toString().toInt()
                add = a + 1
            txt.setText(add.toString())
            view.text = add.toString()
            //view.text=(view.text.toString().toInt()+1).toString()
        }
    }
}