package com.habibo.gadsleaderboard.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.habibo.gadsleaderboard.model.SkillLeader

class SkillLeaderAdapter(private val list: List<SkillLeader>) :
    RecyclerView.Adapter<SkillLeaderHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillLeaderHolder {
        val inflater = LayoutInflater.from(parent.context)
        return SkillLeaderHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: SkillLeaderHolder, position: Int) {
        val skillLeader: SkillLeader = list[position]
        holder.bind(skillLeader)
    }

    override fun getItemCount(): Int = list.size

}
