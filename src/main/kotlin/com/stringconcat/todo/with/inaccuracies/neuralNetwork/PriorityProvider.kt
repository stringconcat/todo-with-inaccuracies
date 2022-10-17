package com.stringconcat.todo.with.inaccuracies.neuralNetwork

import com.stringconcat.todo.with.inaccuracies.domain.Task

interface PriorityProvider {
    fun calculatePriority(task: Task): Task.Priority
}
