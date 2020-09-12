package com.habibo.gadsleaderboard.model

import com.google.gson.annotations.SerializedName

class SkillLeader(
    @SerializedName("name")
    var name: String,
    @SerializedName("score")
    var score: Int,
    @SerializedName("country")
    var country: String,
    @SerializedName("badgeUrl")
    var badgeUrl: String
)
