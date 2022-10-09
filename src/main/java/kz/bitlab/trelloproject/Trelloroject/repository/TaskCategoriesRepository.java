package kz.bitlab.trelloproject.Trelloroject.repository;

import jdk.jfr.Category;
import kz.bitlab.trelloproject.Trelloroject.model.Comments;
import kz.bitlab.trelloproject.Trelloroject.model.TaskCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TaskCategoriesRepository extends JpaRepository<TaskCategories,Long> {
}
