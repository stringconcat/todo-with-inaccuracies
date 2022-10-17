package com.stringconcat.todo.with.inaccuracies.persistance

import com.stringconcat.todo.with.inaccuracies.domain.Task

interface PersistTask {
    fun persist(task: Task)
}