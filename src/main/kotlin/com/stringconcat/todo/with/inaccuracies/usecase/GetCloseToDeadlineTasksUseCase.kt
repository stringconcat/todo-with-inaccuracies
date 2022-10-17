package com.stringconcat.todo.with.inaccuracies.usecase

import com.stringconcat.todo.with.inaccuracies.domain.Task
import java.time.LocalDateTime

interface GetCloseToDeadlineTasksUseCase {
    fun process(deadline : LocalDateTime): List<Task>
}