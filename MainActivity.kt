package com.associacao.partiturasapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PartituraAdapter
    private val partiturasList = mutableListOf<Partitura>()
    private val database: DatabaseReference = FirebaseDatabase.getInstance().reference.child("partituras")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewPartituras)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = PartituraAdapter(partiturasList)
        recyclerView.adapter = adapter

        val fabAdd: FloatingActionButton = findViewById(R.id.fabAdd)
        fabAdd.setOnClickListener {
            startActivity(Intent(this, AddPartituraActivity::class.java))
        }

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                partiturasList.clear()
                for (data in snapshot.children) {
                    val partitura = data.getValue(Partitura::class.java)
                    if (partitura != null) partiturasList.add(partitura)
                }
                adapter.notifyDataSetChanged()
            }
            override fun onCancelled(error: DatabaseError) {}
        })
    }
}
