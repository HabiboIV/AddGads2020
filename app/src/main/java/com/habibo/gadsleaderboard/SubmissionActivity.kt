package com.habibo.gadsleaderboard

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SubmissionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submission)

        findViewById<Button>(R.id.action_back).setOnClickListener { finish() }


        val submitBtn = findViewById<Button>(R.id.action_submit)
        val editTextFirstName = findViewById<EditText>(R.id.editTextFirstName)
        val editTextLastName = findViewById<EditText>(R.id.editTextLastName)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextGithubLink = findViewById<EditText>(R.id.editTextGithubLink)


    }

}