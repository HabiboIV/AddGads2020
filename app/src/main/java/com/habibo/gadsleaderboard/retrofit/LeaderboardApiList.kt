package com.habibo.gadsleaderboard.retrofit

import com.habibo.gadsleaderboard.model.LearningParticipant
import com.habibo.gadsleaderboard.model.SkillParticipant
import retrofit2.Call
import retrofit2.http.*

interface LeaderboardApiList {

    @GET("api/hours")
    fun fetchLearningLeaders(): Call<List<LearningParticipant>>

    @GET("api/skilliq")
    fun fetchSkillLeaders(): Call<List<SkillParticipant>>

}