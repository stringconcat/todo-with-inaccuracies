package com.stringconcat.todo.with.inaccuracies.persistance

import com.stringconcat.todo.with.inaccuracies.domain.Task
import com.stringconcat.todo.with.inaccuracies.persistance.model.TaskEntity
import com.stringconcat.todo.with.inaccuracies.persistance.repository.TaskRepository
import java.time.LocalDateTime
import org.springframework.stereotype.Component

@Component
class GetTasksFromRepository(
    private val repository: TaskRepository
) : GetAllByDeadline, GetAllByPriority {
    override fun invoke(priority: Task.Priority): List<Task> =
        repository
            .findAllByPriority(priority)
            .map { t -> TaskEntity.toBusiness(t) }.toList()

    override fun invoke(deadline: LocalDateTime): List<Task> =
        repository
            .findAllByDeadline(deadline)
            .map { t -> TaskEntity.toBusiness(t) }.toList()
}