package kz.bitlab.trelloproject.Trelloroject.controllers;

import jdk.jfr.Category;
import kz.bitlab.trelloproject.Trelloroject.model.Folders;
import kz.bitlab.trelloproject.Trelloroject.model.TaskCategories;
import kz.bitlab.trelloproject.Trelloroject.model.Tasks;
import kz.bitlab.trelloproject.Trelloroject.repository.FoldersRepository;
import kz.bitlab.trelloproject.Trelloroject.services.CategoryService;
import kz.bitlab.trelloproject.Trelloroject.services.FolderService;
import kz.bitlab.trelloproject.Trelloroject.services.TaskService;
import kz.bitlab.trelloproject.Trelloroject.services.impl.FolderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MainController {
    @Autowired
    private FolderService folderService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/")
    public String mainPage(Model model){
        List<Tasks> tasks = taskService.getTasks(1L);
        List<Folders> folders = folderService.getFolders();

        model.addAttribute("tasks",tasks);
        model.addAttribute("folders",folders);
        return "index";
    }
    @PostMapping(value = "/addfolder")
    public String addFolder(@RequestParam("folder_name") String name){
        Folders folder = new Folders();
        folder.setName(name);
        folderService.addFolder(folder);

        return "redirect:/";
    }
    @GetMapping(value = "/details/{id}")
    public String details(@PathVariable(name = "id") Long id,
                           Model model){
        Folders folders = folderService.findFolder(id).orElseThrow();
        model.addAttribute("folder",folders);
        return "details";
    }
//    @PostMapping(value = "/deletecategory")
//    public String deleteCategory(@RequestParam(name = "id") Long id,
//                                 @RequestParam(name = "folder_id") Long id2){
//    }
    @PostMapping(value = "/assigncategory")
    public String assign(@RequestParam(name = "cat_id") Long cat_id,
                         @RequestParam(name  = "folder_id") Long folder_id,
                         Model model
    ){
        Folders folder = folderService.findFolder(folder_id).orElse(null);
        TaskCategories category = categoryService.getCatById(cat_id).orElse(null);
        if(category!=null && folder!=null){
            List<TaskCategories> categories = folder.getCategories();
            categories.add(category);
            folder.setCategories(categories);
        }
        List<TaskCategories> categories = categoryService.getAllCategories();
        model.addAttribute("categories",categories);
        return "redirect:/deltails/"+folder_id;
    }
}
