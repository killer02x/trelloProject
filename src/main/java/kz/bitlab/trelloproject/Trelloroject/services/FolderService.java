package kz.bitlab.trelloproject.Trelloroject.services;

import kz.bitlab.trelloproject.Trelloroject.model.Folders;
import kz.bitlab.trelloproject.Trelloroject.model.TaskCategories;

import java.util.List;
import java.util.Optional;


public interface FolderService {
    Folders addFolder(Folders folders);
    Folders saveFolder(Folders folders);
    List<Folders> getFolders();
    void deleteFolder(Long id);
    Optional<Folders> findFolder(Long id);
    List<TaskCategories> getCategories(Long id);
    void deleteCategory(Long id1,Long id2);
}
