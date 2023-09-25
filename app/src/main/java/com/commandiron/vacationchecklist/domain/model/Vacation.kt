package com.commandiron.vacationchecklist.domain.model

import com.commandiron.vacationchecklist.R

data class Vacation(
    val id: Int,
    val name: String,
    val iconDrawable: Int,
)

val vacations = listOf(
    Vacation(
        id = 0,
        name = "Morning Routine",
        iconDrawable = R.drawable.morning
    ),
    Vacation(
        id = 1,
        name = "Evening Routine",
        iconDrawable = R.drawable.dusk
    ),
    Vacation(
        id = 1,
        name = "Study Routine",
        iconDrawable = R.drawable.studytime
    ),
    Vacation(
        id = 1,
        name = "Work Routine",
        iconDrawable = R.drawable.worktime
    ),
    Vacation(
        id = 1,
        name = "Hobbies Routine",
        iconDrawable = R.drawable.hobby
    )


)
