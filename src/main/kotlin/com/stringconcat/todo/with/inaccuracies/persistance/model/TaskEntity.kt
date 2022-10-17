package com.stringconcat.todo.with.inaccuracies.persistance.model


import com.stringconcat.todo.with.inaccuracies.domain.Task
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class TaskEntity(
    @Id val id: UUID,
    val description: String,
    val deadline: LocalDateTime,
    val priority: Task.Priority
) {

    companion object {
        fun fromBusiness(t: Task): TaskEntity =
            TaskEntity(
                id = t.id,
                description = t.description,
                deadline = t.deadline,
                priority = t.priority
            )

        fun toBusiness(t: TaskEntity): Task =
            Task(
                id = t.id,
                description = t.description,
                deadline = t.deadline,
                priority = t.priority
            )
    }
}
