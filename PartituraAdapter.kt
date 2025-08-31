package com.associacao.partiturasapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PartituraAdapter(private val partituras: List<Partitura>) :
    RecyclerView.Adapter<PartituraAdapter.PartituraViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PartituraViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_partitura, parent, false)
        return PartituraViewHolder(view)
    }

    override fun onBindViewHolder(holder: PartituraViewHolder, position: Int) {
        val partitura = partituras[position]
        holder.titulo.text = partitura.titulo
        holder.compositor.text = partitura.compositor
        holder.instrumento.text = partitura.instrumento
    }

    override fun getItemCount(): Int = partituras.size

    class PartituraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titulo: TextView = itemView.findViewById(R.id.txtTitulo)
        val compositor: TextView = itemView.findViewById(R.id.txtCompositor)
        val instrumento: TextView = itemView.findViewById(R.id.txtInstrumento)
    }
}
