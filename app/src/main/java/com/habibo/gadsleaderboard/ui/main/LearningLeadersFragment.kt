package com.habibo.gadsleaderboard.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.habibo.gadsleaderboard.R
import com.habibo.gadsleaderboard.model.LearningParticipant
import com.habibo.gadsleaderboard.retrofit.RetrofitInitializer
import com.lmntrx.android.library.livin.missme.ProgressDialog
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A placeholder fragment containing a simple view.
 */
class LearningLeadersFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView = inflater.inflate(R.layout.learning_fragment, container, false);

        val recyclerView = rootView.findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = LearningParticipantAdapter(listOf<LearningParticipant>(
            LearningParticipant("Loading",0,"Loading","")
        ))


        val loading = activity?.let { ProgressDialog(it) }

        if (loading != null) {
            loading.setCancelable(false)
            loading.setMessage("Loading")
            loading.show()
        }

        val retrofit = RetrofitInitializer.initializeLeaderboard()
        val call = retrofit.fetchLearningLeaders()

        call.enqueue(object : Callback<List<LearningParticipant>> {
            override fun onResponse(
                call: Call<List<LearningParticipant>>,
                response: Response<List<LearningParticipant>>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let { list ->
                        recyclerView.layoutManager = LinearLayoutManager(activity)
                        recyclerView.adapter = LearningParticipantAdapter(list)
                        list.forEach { Log.v("TAG", it.name) }
                    }
                }
                if (loading != null) {
                    loading.dismiss()
                }
                Log.v("TAG", "finished")
            }

            override fun onFailure(call: Call<List<LearningParticipant>>, t: Throwable) {
                if (loading != null) {
                    loading.dismiss()
                }
                Log.v("TAG", "error")
            }
        })

        return rootView
    }


}