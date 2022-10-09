package kz.bitlab.trelloproject.Trelloroject.services.impl;

import kz.bitlab.trelloproject.Trelloroject.model.Folders;
import kz.bitlab.trelloproject.Trelloroject.model.Tasks;
import kz.bitlab.trelloproject.Trelloroject.repository.TasksRepository;
import kz.bitlab.trelloproject.Trelloroject.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TasksRepository tasksRepository;




    @Override
    public Tasks addTasks(Tasks tasks) {
        return tasksRepository.save(tasks);
    }



    public List<Tasks> getTasks(Long id) {
        return  tasksRepository.getTasksById(id);
    }
}
