package com.agn.farklaktiviteler

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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
    fun uyariBas(view:View){
        val Uyarımesaji=AlertDialog.Builder(this@MainActivity2)
        Uyarımesaji.setTitle("Yanlış işlem")
        Uyarımesaji.setMessage("Yanlış parola girildi Tekrar denemek ister misin")
        //Lambda gösterimi
        Uyarımesaji.setPositiveButton("Evet",DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this,"anasayfaya yönlendirildin",Toast.LENGTH_LONG).show()
            val intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        })
        Uyarımesaji.setNegativeButton("Hayır",DialogInterface.OnClickListener{dialog, which ->
            Toast.makeText(this,"bekle o zaman burada ",Toast.LENGTH_LONG).show()
        })
        Uyarımesaji.show()

    }
}