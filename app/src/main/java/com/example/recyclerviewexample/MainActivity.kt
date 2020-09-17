package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songsObject : MutableList<Song> = mutableListOf<Song>()
        songsObject.add(Song("Mere Sapno Ki Rani","Aradhana"))
        songsObject.add(Song("Chookar Mere Man ko","Yaarana"))
        songsObject.add(Song("Chura Liya Hai Tumne Joh Dil Ko","Yaadon Ki Baarat"))
        songsObject.add(Song("Main Tenu Samjhawan Ki","Humpty Sharma Ki Dulhania"))
        songsObject.add(Song("Sab Tera","Bhaagi"))
        songsObject.add(Song("Agar Tum Saath Ho","Tamasha"))
        songsObject.add(Song("Chand Sifarish","Faana"))
        songsObject.add(Song("Guzarish","Ghajini"))
        songsObject.add(Song("Ghunghroo","War"))
        songsObject.add(Song("Sauda Khara Khara","Good Newwz"))
        songsObject.add(Song("Naah Goriye","Bala"))
        songsObject.add(Song("Tum Hi Ho","Aashiqui2"))

        songList.adapter = MyAdapter(songsObject)
        songList.layoutManager = LinearLayoutManager(this)
    }
}