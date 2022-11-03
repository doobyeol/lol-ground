package com.leaf.lolground.domain.summoner.dto

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*

data class Summoner(
    val id: String,
    val accountId: String,
    val puuid: String,
    val name: String,
    val profileIconId: Long,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    val revisionDate: Date?,
    val summonerLevel: Long,
) {
    companion object {
        fun empty(): Summoner =
            Summoner(
                "",
                "",
                "",
                "",
                0L,
                null,
                0L
            )
    }

    var isEmpty: Boolean = true
        get() = this.id.isEmpty()
}
