package com.stringconcat.todo.with.inaccuracies.usecase.scenarious

import com.stringconcat.todo.with.inaccuracies.domain.Task
import com.stringconcat.todo.with.inaccuracies.neuralNetwork.PriorityProvider
import com.stringconcat.todo.with.inaccuracies.usecase.CreateNewTaskUseCase
import com.stringconcat.todo.with.inaccuracies.persistance.PersistTask
import com.stringconcat.todo.with.inaccuracies.domain.TaskRequest
import java.time.LocalDateTime
import java.time.ZoneOffset
import javax.inject.Named

@Named
class CreateNewTaskScenarious(
    private val persistTask: PersistTask,
    private val priorityProvider: PriorityProvider
) : CreateNewTaskUseCase {
    override operator fun invoke(task: TaskRequest): Task {

        val createdTask = Task(
            description = task.description,
            deadline = LocalDateTime.ofEpochSecond(task.deadline, 0, ZoneOffset.UTC)
        ).also {
            val priority = priorityProvider.calculatePriority(it)
            it.priority = priority
        }

        persistTask.persist(createdTask)

        return createdTask
    }
}