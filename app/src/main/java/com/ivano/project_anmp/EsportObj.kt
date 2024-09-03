package com.ivano.project_anmp

data class EsportObj(
    val name: String, val description: String
)

fun getEsportGames(): List<EsportObj> {
    return listOf(
        EsportObj(
            name = "League of Legends",
            description = "A fast-paced, competitive online game that blends the speed and intensity of an RTS with RPG elements."
        ),
        EsportObj(
            name = "Dota 2",
            description = "A complex, team-based game that combines strategy with real-time action."
        ),
        EsportObj(
            name = "Counter-Strike: Global Offensive",
            description = "A first-person shooter that pits two teams against each other: Terrorists and Counter-Terrorists."
        ),
        EsportObj(
            name = "Fortnite",
            description = "A battle royale game where 100 players fight to be the last person standing."
        ),
        EsportObj(
            name = "Valorant",
            description = "A tactical first-person shooter with unique agents, each with their own special abilities."
        ),
        EsportObj(
            name = "Overwatch",
            description = "A team-based shooter with heroes that have unique abilities and roles within the team."
        )
    )
}