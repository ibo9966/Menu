package com.example.pariscafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val menu = intent.getParcelableExtra<Menu>("menu")
        if (menu!=null){
            val textViewAd:TextView=findViewById(R.id.textViewAdDetail)
            val textViewFiyat:TextView=findViewById(R.id.textViewFiyatDetail)
            val imageView:ImageView=findViewById(R.id.imageViewDetail)

            textViewAd.text=menu.name
            textViewFiyat.text=menu.fiyat
            imageView.setImageResource(menu.image)

        }

        buttonEkle.setOnClickListener {
            Toast.makeText(this,"Siparişiniz 10 dakikaya masanıza gelecektir.",Toast.LENGTH_SHORT).show()
        }

        buttonGeri.setOnClickListener {
            onBackPressed()
        }
    }
}