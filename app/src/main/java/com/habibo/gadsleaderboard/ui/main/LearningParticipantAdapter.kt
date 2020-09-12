package com.habibo.gadsleaderboard.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.habibo.gadsleaderboard.model.LearningParticipant

class LearningParticipantAdapter(private val list: List<LearningParticipant>) :
    RecyclerView.Adapter<LearningParticipantHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearningParticipantHolder {
        val inflater = LayoutInflater.from(parent.context)
        return LearningParticipantHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: LearningParticipantHolder, position: Int) {
        val learningParticipant: LearningParticipant = list[position]
        holder.bind(learningParticipant)
    }

    override fun getItemCount(): Int = list.size

}
