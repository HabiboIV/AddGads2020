package com.habibo.gadsleaderboard

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import cn.pedant.SweetAlert.SweetAlertDialog
import com.habibo.gadsleaderboard.retrofit.RetrofitInitializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SubmissionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submission)

        findViewById<Button>(R.id.action_back).setOnClickListener { finish() }

        val editTextFirstName = findViewById<EditText>(R.id.editTextFirstName)
        val editTextLastName = findViewById<EditText>(R.id.editTextLastName)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextGithubLink = findViewById<EditText>(R.id.editTextGithubLink)

        findViewById<Button>(R.id.action_submit).setOnClickListener {

            SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                .setTitleText(getString(R.string.dialog_sure))
                .setConfirmText(getString(R.string.dialog_positive))
                .setCancelText(getString(R.string.dialog_negativo))
                .setConfirmClickListener {
                    it.dismiss()
                    val retrofit = RetrofitInitializer.initializeSubmit()
                    val call = retrofit.submitProject(
                        editTextEmail.text.toString(),
                        editTextFirstName.text.toString(),
                        editTextLastName.text.toString(),
                        editTextGithubLink.text.toString()
                    )

                    call.enqueue(object : Callback<Void> {
                        override fun onResponse(call: Call<Void>, response: Response<Void>) {
                            sucessDialog()
                        }

                        override fun onFailure(call: Call<Void>, t: Throwable) {
                            errorDialog()
                        }
                    })


                }.show();


        }


    }

    private fun errorDialog() {
        SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
            .setTitleText("Error!")
            .setContentText("Error While Submitting")
            .show();

    }

    private fun sucessDialog() {
        SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
            .setTitleText("Success!")
            .setContentText("Submission Successful")
            .show();
    }

}