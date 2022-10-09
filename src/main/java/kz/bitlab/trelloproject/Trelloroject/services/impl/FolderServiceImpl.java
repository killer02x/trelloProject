package kz.bitlab.trelloproject.Trelloroject.services.impl;

import kz.bitlab.trelloproject.Trelloroject.model.Folders;
import kz.bitlab.trelloproject.Trelloroject.model.TaskCategories;
import kz.bitlab.trelloproject.Trelloroject.repository.FoldersRepository;
import kz.bitlab.trelloproject.Trelloroject.repository.TaskCategoriesRepository;
import kz.bitlab.trelloproject.Trelloroject.services.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FolderServiceImpl implements FolderService {
    @Autowired
    private FoldersRepository foldersRepository;

    @Autowired
    private TaskCategoriesRepository categoriesRepository;

    @Override
    public Folders addFolder(Folders folders) {
        return foldersRepository.save(folders);
    }

    @Override
    public Folders saveFolder(Folders folders) {


             Folders check  = foldersRepository.findById(folders.getId()).orElse(null);
             if(check!=null){
                 check.setName(folders.getName());
                 check.setCategories(folders.getCategories());
                 return foldersRepository.save(check);
             }
        return null;

    }

    @Override
    public List<Folders> getFolders() {
        return foldersRepository.findAll();
    }

    @Override
    public void deleteFolder(Long id) {
        foldersRepository.deleteById(id);
    }

    @Override
    public List<TaskCategories> getCategories(Long id) {
        Folders folders1 = foldersRepository.findById(id).orElse(null);
        if(folders1!=null){
            return folders1.getCategories();
        }
        return null;
    }

    @Override
    public Optional<Folders> findFolder(Long id) {
        return foldersRepository.findById(id);
    }

    @Override
    public void deleteCategory(Long id1, Long id2) {

    }
}
