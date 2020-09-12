package com.habibo.gadsleaderboard.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInitializer {

    fun initializeSubmit(): SubmitApiList {
        var retrofit = Retrofit.Builder()
            .baseUrl("https://docs.google.com/forms/d/e/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(SubmitApiList::class.java)
    }

    fun initializeLeaderboard(): LeaderboardApiList {
        var retrofit = Retrofit.Builder()
            .baseUrl("https://gadsapi.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(LeaderboardApiList::class.java)
    }


}
