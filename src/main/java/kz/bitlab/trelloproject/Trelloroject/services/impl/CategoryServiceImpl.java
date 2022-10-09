package kz.bitlab.trelloproject.Trelloroject.services.impl;

import kz.bitlab.trelloproject.Trelloroject.model.TaskCategories;
import kz.bitlab.trelloproject.Trelloroject.repository.TaskCategoriesRepository;
import kz.bitlab.trelloproject.Trelloroject.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private TaskCategoriesRepository taskCategoriesRepository;
    @Override
    public Optional<TaskCategories> getCatById(Long id) {
        return taskCategoriesRepository.findById(id);
    }

    @Override
    public List<TaskCategories> getAllCategories() {
        return taskCategoriesRepository.findAll();
    }
}
