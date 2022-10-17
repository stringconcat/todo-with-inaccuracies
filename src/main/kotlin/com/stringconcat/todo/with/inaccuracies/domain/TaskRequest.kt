package com.stringconcat.todo.with.inaccuracies.domain

data class TaskRequest(
    val description: String,
    val deadline: Long,
)