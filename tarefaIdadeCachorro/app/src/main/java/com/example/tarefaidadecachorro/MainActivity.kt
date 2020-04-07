package com.example.tarefaidadecachorro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_mostar_idade.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnCalcular(view: View) {
        val idade = edit_idade.text.toString()

        val intent = Intent(this, MostarIdadeActivity::class.java)
            intent.putExtra("idade", idade)
        startActivity(intent)
    }
}

