package com.stringconcat.todo.with.inaccuracies.persistance

import com.stringconcat.todo.with.inaccuracies.domain.Task
import com.stringconcat.todo.with.inaccuracies.persistance.model.TaskEntity
import com.stringconcat.todo.with.inaccuracies.persistance.repository.TaskRepository
import org.springframework.stereotype.Component

@Component
class PersistTaskToDataBase(
    private val repository: TaskRepository
) : PersistTask {
    override fun persist(task: Task) {
        repository
            .save(TaskEntity.fromBusiness(task))
            .let { TaskEntity.toBusiness(it) }
    }
}