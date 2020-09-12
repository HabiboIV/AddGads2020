package com.habibo.gadsleaderboard.retrofit

import retrofit2.Call
import retrofit2.http.*

interface SubmitApiList {



    @POST("1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse")
    @FormUrlEncoded
    fun submitProject(
        @Field("entry.1824927963") emailAdress: String,
        @Field("entry.1877115667") firstName: String,
        @Field("entry.2006916086") lastName: String,
        @Field("entry.284483984") projectLink: String,
    ): Call<Void>

}