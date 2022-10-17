package com.stringconcat.todo.with.inaccuracies.rest.endpoints

import com.stringconcat.todo.with.inaccuracies.rest.API_V1_ADD_TASK
import com.stringconcat.todo.with.inaccuracies.domain.TaskRequest
import com.stringconcat.todo.with.inaccuracies.usecase.CreateNewTaskUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AddTaskEndpoint(val createNewTask: CreateNewTaskUseCase) {
    @PostMapping(path = [API_V1_ADD_TASK])
    fun execute(@RequestBody request: TaskRequest): ResponseEntity<*> {

        val task = createNewTask.invoke(request)

        return ResponseEntity.ok(task)
    }
}


