package com.example.biscoitodasorte

import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biscoitodasorte.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // fun main() {

//            val frase1 = "Não dê atenção às palavras vãs de más línguas."
//            val frase2 = "Seja orgulhoso, porém tolerante e generoso."
//            val frase3 = "Uma boa época para terminar tarefas antigas."
//            val frase4 = "Você é jovem apenas uma vez. Depois precisa inventar outra desculpa."
//            val frase5 = "Quando a coceira é dentro da bota, coçar o lado de fora não alivia muito."
//            val frase6 = "Más companhias são como um mercado de peixes: acaba-se acostumando com o mal cheiro."
//            val random = frase1;frase2;frase3;frase4;frase5;frase6.random()
//
//        } //


        val frases = arrayListOf(
            "Não dê atenção às palavras vãs de más línguas.",
            "Seja orgulhoso, porém tolerante e generoso.",
            "Uma boa época para terminar tarefas antigas.",
            "Você é jovem apenas uma vez. Depois precisa inventar outra desculpa.",
            "Quando a coceira é dentro da bota, coçar o lado de fora não alivia muito.",
            "Más companhias são como um mercado de peixes: acaba-se acostumando com o mal cheiro.",
            "A maior de todas as torres começa no solo.",
            "Siga os bons e aprenda com eles.",
            "A adversidade é um espelho que reflete o verdadeiro eu.",
            "Amizade e Amor são coisas que se unem num piscar de olhos.",
            "Todas as coisas são difíceis antes de se tornarem fáceis.",
            "Você é do tamanho do seu sonho.",
            "Pare de procurar eternamente; a felicidade está mesmo aqui ao seu lado.",
            "A maior barreira para o sucesso é o medo do fracasso.",
            "Motivação não é sinónimo de transformação, mas um passo em sua direção."
        )
        val random = frases.random()

        binding.txtFrase.text= random.toString()

        binding.btnFraseDaSorte.setOnClickListener {

            val random2 = frases.random()

            binding.txtFrase.text= random.toString()
        }

    }


    }





