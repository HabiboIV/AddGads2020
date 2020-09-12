package com.habibo.gadsleaderboard.model

import com.google.gson.annotations.SerializedName

class SkillParticipant(
    @SerializedName("name")
    var name: String,
    @SerializedName("score")
    var hours: Int,
    @SerializedName("country")
    var country: String,
    @SerializedName("badgeUrl")
    var badgeUrl: String
)
