package com.stringconcat.todo.with.inaccuracies.persistance

import com.stringconcat.todo.with.inaccuracies.domain.Task
import com.stringconcat.todo.with.inaccuracies.persistance.model.TaskEntity
import com.stringconcat.todo.with.inaccuracies.persistance.repository.TaskRepository
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class GetTasksFromRepository(
    private val repository: TaskRepository
) : GetTasks {
    override fun findAllByPriority(priority: Task.Priority): List<Task> =
        repository
            .findAllByPriority(priority)
            .map { t -> TaskEntity.toBusiness(t) }.toList()

    override fun findAllByDeadline(deadline: LocalDateTime): List<Task> =
        repository
            .findAllByDeadline(deadline)
            .map { t -> TaskEntity.toBusiness(t) }.toList()

}