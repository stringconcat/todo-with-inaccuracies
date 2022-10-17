package com.stringconcat.todo.with.inaccuracies.rest.endpoints

import com.stringconcat.todo.with.inaccuracies.rest.API_V1_GET_CLOSE_TO_DEADLINE
import com.stringconcat.todo.with.inaccuracies.usecase.GetCloseToDeadlineTasksUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.time.LocalDateTime
import java.time.ZoneOffset

class GetCloseToDeadlineTasksEndpoint(val getCloseToDeadlineTasks: GetCloseToDeadlineTasksUseCase) {
    @GetMapping(path = [API_V1_GET_CLOSE_TO_DEADLINE])
    fun execute(@PathVariable("deadline") deadline: Long): ResponseEntity<*> {
        return ResponseEntity.ok(
            getCloseToDeadlineTasks.process(
                LocalDateTime.ofEpochSecond(deadline, 0, ZoneOffset.UTC)
            )
        )
    }
}