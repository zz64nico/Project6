package com.example.project6

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var addNoteButton: FloatingActionButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)
        addNoteButton = view.findViewById(R.id.addNoteButton)

        // Set up the RecyclerView with an adapter
        // recyclerView.adapter = YourAdapter()

        addNoteButton.setOnClickListener {
            // Navigate to NoteFragment to add a new note
        }
    }
}
