package com.stringconcat.todo.with.inaccuracies.usecase.scenarious

import com.stringconcat.todo.with.inaccuracies.domain.Task
import com.stringconcat.todo.with.inaccuracies.persistance.GetAllByDeadline
import com.stringconcat.todo.with.inaccuracies.usecase.GetCloseToDeadlineTasksUseCase
import java.time.LocalDateTime
import javax.inject.Named

@Named
class GetCloseToDeadlineTasksScenarious(
    private val getTasks: GetAllByDeadline
) : GetCloseToDeadlineTasksUseCase {
    override fun process(deadline: LocalDateTime): List<Task> {
        return getTasks(deadline)
    }
}