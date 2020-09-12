package com.habibo.gadsleaderboard.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.habibo.gadsleaderboard.R
import com.habibo.gadsleaderboard.model.SkillLeader

class SkillLeaderHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.skill_item, parent, false)) {
    private var name: TextView? = null
    private var info: TextView? = null

    init {
        name = itemView.findViewById(R.id.name)
        info = itemView.findViewById(R.id.info)
    }

    fun bind(skillLeader: SkillLeader) {
        name?.text = skillLeader.name
        info?.text = skillLeader.score.toString().plus(" Points, From ".plus(skillLeader.country))
    }

}