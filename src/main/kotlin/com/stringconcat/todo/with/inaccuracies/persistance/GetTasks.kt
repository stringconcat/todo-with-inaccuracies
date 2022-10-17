package com.stringconcat.todo.with.inaccuracies.persistance

import com.stringconcat.todo.with.inaccuracies.domain.Task
import java.time.LocalDateTime

interface GetTasks {
    fun findAllByPriority(priority: Task.Priority): List<Task>
    fun findAllByDeadline(deadline: LocalDateTime): List<Task>
}