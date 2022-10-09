package kz.bitlab.trelloproject.Trelloroject.services;

import com.sun.source.util.TaskListener;
import kz.bitlab.trelloproject.Trelloroject.model.TaskCategories;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Optional<TaskCategories> getCatById(Long id);
    List<TaskCategories> getAllCategories();
}
