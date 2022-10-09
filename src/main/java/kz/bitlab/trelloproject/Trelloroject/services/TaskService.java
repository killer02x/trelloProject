package kz.bitlab.trelloproject.Trelloroject.services;


import kz.bitlab.trelloproject.Trelloroject.model.Folders;
import kz.bitlab.trelloproject.Trelloroject.model.Tasks;

import java.util.List;

public interface TaskService {
    Tasks addTasks(Tasks tasks);

    List<Tasks> getTasks(Long id);


}
