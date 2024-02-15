package com.agn.farklaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.agn.farklaktiviteler.databinding.ActivityMain2Binding
import com.agn.farklaktiviteler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
        println("aktivite başladı on create")
    }

    override fun onStart() {
        super.onStart()
        println("on start çalıştı")

    }

    override fun onResume() {
        super.onResume()
        println("on resume çalıştı")
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
    fun ikigecis(view: View){
        val kullanıcıVerisi=binding.viewText.text.toString()
        val intent= Intent(applicationContext,MainActivity2::class.java)
        intent.putExtra("veri1",kullanıcıVerisi)
        startActivity(intent)

    }
    fun mesajBas(view:View){
    //Toast ve Alert mesaj methodları
        //applicationContext -> app context
        //this ve this@MainActivity ----> context için referans verme yolu ---<aktivitenin contexti
        Toast.makeText(this,("Hoşgeldin!!"),Toast.LENGTH_LONG).show()


    }
}