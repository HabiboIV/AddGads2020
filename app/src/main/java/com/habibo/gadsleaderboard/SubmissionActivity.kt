package com.habibo.gadsleaderboard

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SubmissionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submission)
        val goBackBtn = findViewById<Button>(R.id.action_back)

        goBackBtn.setOnClickListener {
            finish()
        }


    }

}