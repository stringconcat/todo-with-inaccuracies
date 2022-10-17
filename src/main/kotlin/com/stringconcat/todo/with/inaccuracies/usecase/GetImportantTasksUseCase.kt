package com.stringconcat.todo.with.inaccuracies.usecase

import com.stringconcat.todo.with.inaccuracies.domain.Task

interface GetImportantTasksUseCase {
    fun process() : List<Task>
}