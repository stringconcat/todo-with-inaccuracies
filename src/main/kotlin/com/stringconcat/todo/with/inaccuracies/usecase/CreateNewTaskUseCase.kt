package com.stringconcat.todo.with.inaccuracies.usecase

import com.stringconcat.todo.with.inaccuracies.domain.Task
import com.stringconcat.todo.with.inaccuracies.domain.TaskRequest

interface CreateNewTaskUseCase {
    fun invoke(task: TaskRequest): Task
}