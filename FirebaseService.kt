package com.associacao.partiturasapp

import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage

object FirebaseService {
    private val database = FirebaseDatabase.getInstance().reference.child("partituras")
    private val storage = FirebaseStorage.getInstance().reference.child("partituras")

    fun addPartitura(partitura: Partitura, onComplete: (Boolean) -> Unit) {
        val id = database.push().key
        if (id != null) {
            partitura.id = id
            database.child(id).setValue(partitura)
                .addOnCompleteListener { task ->
                    onComplete(task.isSuccessful)
                }
        } else {
            onComplete(false)
        }
    }
}
