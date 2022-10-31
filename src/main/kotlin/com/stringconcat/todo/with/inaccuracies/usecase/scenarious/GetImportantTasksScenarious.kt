package com.stringconcat.todo.with.inaccuracies.usecase.scenarious

import com.stringconcat.todo.with.inaccuracies.domain.Task
import com.stringconcat.todo.with.inaccuracies.persistance.GetAllByPriority
import com.stringconcat.todo.with.inaccuracies.usecase.GetImportantTasksUseCase
import javax.inject.Named

@Named
class GetImportantTasksScenarious(
    private val getTasks: GetAllByPriority,
) : GetImportantTasksUseCase {

    override fun process(): List<Task> {
        return getTasks(Task.Priority.HIGH)
    }
}