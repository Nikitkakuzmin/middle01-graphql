package kz.nik.middle01graphql.controller;
import kz.nik.middle01graphql.model.Task;
import kz.nik.middle01graphql.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TaskQueryResolver {

    private final TaskService taskService;

    @QueryMapping
    public List<Task> findAllTasks(){
        return taskService.getTaskList();
    }

    @MutationMapping
    public Task createTask(@Argument String name){
        return taskService.createTask(name);
    }
}