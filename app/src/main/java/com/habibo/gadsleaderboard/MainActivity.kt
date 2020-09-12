package com.habibo.gadsleaderboard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import com.habibo.gadsleaderboard.ui.main.SectionsPagerAdapter

class MainActivity : AppCompatActivity() {

    private fun goToSubmissionActivity() {
        val intent = Intent(this, SubmissionActivity::class.java)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        val submissionBtn = findViewById<Button>(R.id.action_submission)
        submissionBtn.setOnClickListener {
            goToSubmissionActivity()
        }

    }
}