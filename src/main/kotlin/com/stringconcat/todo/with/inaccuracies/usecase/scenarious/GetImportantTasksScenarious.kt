package com.stringconcat.todo.with.inaccuracies.usecase.scenarious

import com.stringconcat.todo.with.inaccuracies.domain.Task
import com.stringconcat.todo.with.inaccuracies.usecase.GetImportantTasksUseCase
import com.stringconcat.todo.with.inaccuracies.persistance.GetTasks
import javax.inject.Named

@Named
class GetImportantTasksScenarious(
    private val getTasks: GetTasks
) : GetImportantTasksUseCase {

    override fun process(): List<Task> {
        return getTasks.findAllByPriority(Task.Priority.HIGH)
    }
}