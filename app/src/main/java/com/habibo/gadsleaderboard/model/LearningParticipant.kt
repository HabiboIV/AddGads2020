package com.habibo.gadsleaderboard.model

import com.google.gson.annotations.SerializedName

class LearningParticipant(
    @SerializedName("name")
    var name: String,
    @SerializedName("hours")
    var hours: Int,
    @SerializedName("country")
    var country: String,
    @SerializedName("badgeUrl")
    var badgeUrl: String
)
