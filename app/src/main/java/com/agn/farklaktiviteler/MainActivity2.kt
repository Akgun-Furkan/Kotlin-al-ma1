package com.agn.farklaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.agn.farklaktiviteler.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main2)
        val intent=intent
        val alınanVeri=intent.getStringExtra("veri1")
        binding.textView.text=alınanVeri
    }
    fun geridön(view: View){
        val intent= Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()



    }
}