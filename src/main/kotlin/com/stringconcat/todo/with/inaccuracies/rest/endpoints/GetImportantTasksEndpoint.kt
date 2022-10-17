package com.stringconcat.todo.with.inaccuracies.rest.endpoints

import com.stringconcat.todo.with.inaccuracies.rest.API_V1_GET_IMPORTANT
import com.stringconcat.todo.with.inaccuracies.usecase.GetImportantTasksUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GetImportantTasksEndpoint(val getImportantTasks: GetImportantTasksUseCase) {
    @GetMapping(path = [API_V1_GET_IMPORTANT])
    fun execute(): ResponseEntity<*> {
        return ResponseEntity.ok(getImportantTasks.process())
    }
}