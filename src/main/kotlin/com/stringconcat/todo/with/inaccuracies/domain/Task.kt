package com.stringconcat.todo.with.inaccuracies.domain

import java.time.LocalDateTime
import java.util.*

data class Task(
    val id: UUID = UUID.randomUUID(),
    val description: String,
    val deadline: LocalDateTime,
    var priority: Priority = Priority.NEED_CALCULATION
) {
    enum class Priority {
        NEED_CALCULATION, LOW, MIDDLE, HIGH
    }
}
