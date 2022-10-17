package com.stringconcat.todo.with.inaccuracies.neuralNetwork

import com.stringconcat.todo.with.inaccuracies.domain.Task
import java.time.ZoneOffset
import javax.inject.Named

@Named
class TaskPriorityProvider : PriorityProvider {
    override fun calculatePriority(task: Task): Task.Priority {
        return when ((task.description.length
                + task.deadline.toEpochSecond(ZoneOffset.UTC)) % 3) {
            0L -> Task.Priority.LOW
            1L -> Task.Priority.MIDDLE
            2L -> Task.Priority.HIGH
            else -> throw IllegalStateException("Invalid rating param value")
        }
    }
}