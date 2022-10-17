package com.stringconcat.todo.with.inaccuracies.usecase.scenarious

import com.stringconcat.todo.with.inaccuracies.domain.Task
import com.stringconcat.todo.with.inaccuracies.usecase.GetCloseToDeadlineTasksUseCase
import com.stringconcat.todo.with.inaccuracies.persistance.GetTasks
import java.time.LocalDateTime
import javax.inject.Named

@Named
class GetCloseToDeadlineTasksScenarious(
    private val getTasks: GetTasks
) : GetCloseToDeadlineTasksUseCase {
    override fun process(deadline: LocalDateTime): List<Task> {
        return getTasks.findAllByDeadline(deadline)
    }
}