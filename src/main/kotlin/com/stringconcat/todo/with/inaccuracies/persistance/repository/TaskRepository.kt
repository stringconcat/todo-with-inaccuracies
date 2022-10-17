package com.stringconcat.todo.with.inaccuracies.persistance.repository

import com.stringconcat.todo.with.inaccuracies.domain.Task
import com.stringconcat.todo.with.inaccuracies.persistance.model.TaskEntity
import org.springframework.data.repository.CrudRepository
import java.time.LocalDateTime
import java.util.*

interface TaskRepository : CrudRepository<TaskEntity, UUID> {
    fun findAllByPriority(priority: Task.Priority): List<TaskEntity>
    fun findAllByDeadline(deadline: LocalDateTime): List<TaskEntity>
}