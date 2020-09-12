package com.habibo.gadsleaderboard.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.habibo.gadsleaderboard.R

/**
 * A placeholder fragment containing a simple view.
 */
class SkillLeadersFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.skill_fragment, container, false)

        return root
    }


}