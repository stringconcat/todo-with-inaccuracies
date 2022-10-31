package com.stringconcat.todo.with.inaccuracies.persistance

import com.stringconcat.todo.with.inaccuracies.domain.Task
import java.time.LocalDateTime

fun interface GetAllByPriority {
    operator fun invoke(priority: Task.Priority): List<Task>
}

fun interface GetAllByDeadline {
    operator fun invoke(deadline: LocalDateTime): List<Task>
}