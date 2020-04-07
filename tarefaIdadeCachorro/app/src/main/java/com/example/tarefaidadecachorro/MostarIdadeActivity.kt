package com.example.tarefaidadecachorro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mostar_idade.*

class MostarIdadeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostar_idade)

        val dados: Bundle? = intent.extras

        val idade_cachorro = dados?.getString("idade")

       calcularIdadeAnimal(idade_cachorro.toString())
    }

    fun calcularIdadeAnimal(idade_cachorro: String){
        val idade2 = idade_cachorro?.toInt()

        val idadeDeHumano = idade2 * 7

       text_resultado.setText("A idade do seu cachorro é de " + idadeDeHumano.toString() + " anos humanos.")
    }
}
