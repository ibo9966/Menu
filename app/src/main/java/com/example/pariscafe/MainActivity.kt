package com.example.pariscafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var menuList: ArrayList<Menu>
    private lateinit var menuAdapter: MenuAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)

        menuList= ArrayList()

        menuList.add(Menu(R.drawable.pogaca,"Poğaça","8 TL"))
        menuList.add(Menu(R.drawable.simit,"Simit","9 TL"))
        menuList.add(Menu(R.drawable.kasarli,"Kaşarlı Tost","20 TL"))
        menuList.add(Menu(R.drawable.sucuklu,"Sucuklu Tost","29 TL"))
        menuList.add(Menu(R.drawable.yengen,"Yengen Tost","36 TL"))
        menuList.add(Menu(R.drawable.ayvalik,"Ayvalık Tostu","40 TL"))
        menuList.add(Menu(R.drawable.borek,"Börek","40 TL"))
        menuList.add(Menu(R.drawable.suboregi,"Su böreği","40 TL"))
        menuList.add(Menu(R.drawable.corba,"Mercimek Ç","20 TL"))
        menuList.add(Menu(R.drawable.pide,"Pide","80 TL"))
        menuList.add(Menu(R.drawable.lahmacun,"Lahmacun","28 TL"))
        menuList.add(Menu(R.drawable.doner,"Döner","40 TL"))
        menuList.add(Menu(R.drawable.twrap,"Tavuk Wrap","80 TL"))
        menuList.add(Menu(R.drawable.ewrap,"Et Wrap","90 TL"))
        menuList.add(Menu(R.drawable.taco,"Taco","30 TL"))
        menuList.add(Menu(R.drawable.iskender,"İskender","99 TL"))
        menuList.add(Menu(R.drawable.makarna,"Makarna","59 TL"))
        menuList.add(Menu(R.drawable.hamburger,"Hamburger","90 TL"))
        menuList.add(Menu(R.drawable.adana,"Adana","60 TL"))
        menuList.add(Menu(R.drawable.urfa,"Urfa","60 TL"))
        menuList.add(Menu(R.drawable.beyti,"Beyti Kebabı","80 TL"))
        menuList.add(Menu(R.drawable.baklava,"Baklava","80 TL"))
        menuList.add(Menu(R.drawable.kunefe,"Künefe","70 TL"))
        menuList.add(Menu(R.drawable.kadayif,"Kadayıf","70 TL"))
        menuList.add(Menu(R.drawable.sutlac,"Sütlaç","30 TL"))






        menuAdapter=MenuAdapter(menuList)
        recyclerView.adapter=menuAdapter

        menuAdapter.onItemClick={

            val intent= Intent(this,DetailActivity::class.java)
            intent.putExtra("menu",it)
            startActivity(intent)
        }







    }
}