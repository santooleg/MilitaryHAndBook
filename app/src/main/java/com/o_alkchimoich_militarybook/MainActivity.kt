package com.o_alkchimoich_militarybook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nav_view = findViewById<NavigationView>(R.id.nav_view)
        nav_view.setNavigationItemSelectedListener(this)

        var list = ArrayList<ListItem>()

        list.add(ListItem(R.drawable.usa1, "M1 'COMBAT CAR' ЛЕГКИЙ ТАНК", "Первый серийный американский легкий танк после 1918 года."))
        list.add(ListItem(R.drawable.usa2, "M1 / T4, БРОНЕАВТОМОБИЛЬ", "Первый в истории бронеавтомобиль с самонесущим броневым кузовом построенный в 1932 г. фирмой Каннингхэм."))
        list.add(ListItem(R.drawable.usa3, "M1, СРЕДНИЙ ТАНК", "Medium Tank M1 — опытный средний колёсно-гусеничныйтанк США 1930-х годов."))
        list.add(ListItem(R.drawable.usa4,"M10 WOLVERINE."," ПРОТИВОТАНКОВАЯ САМОХОДНАЯ УСТАНОВКА."))
        list.add(ListItem(R.drawable.usa5,"155 mm Gun Motor Carriage M12"," САМОХОДНАЯ АРТИЛЛЕРИЙСКАЯ УСТАНОВКА."))


        val rcView = findViewById<RecyclerView>(R.id.rcView)
        rcView.hasFixedSize()
        rcView.layoutManager = LinearLayoutManager(this)
        rcView.adapter = MyAdapter(list, this)




    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.id_usa -> Toast.makeText(this, "Id usa", Toast.LENGTH_SHORT).show()
            R.id.id_ussr -> Toast.makeText(this, "Id ussr", Toast.LENGTH_SHORT).show()
            R.id.id_german -> Toast.makeText(this, "Id german", Toast.LENGTH_SHORT).show()
            R.id.id_uk -> Toast.makeText(this, "Id uk", Toast.LENGTH_SHORT).show()
            R.id.id_japan -> Toast.makeText(this, "Id japan", Toast.LENGTH_SHORT).show()
            R.id.id_italy -> Toast.makeText(this, "Id italy", Toast.LENGTH_SHORT).show()
            R.id.id_france -> Toast.makeText(this, "Id france", Toast.LENGTH_SHORT).show()
            R.id.id_poland -> Toast.makeText(this, "Id poland", Toast.LENGTH_SHORT).show()

        }
        return true
    }
}