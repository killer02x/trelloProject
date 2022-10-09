package kz.bitlab.trelloproject.Trelloroject.repository;

import kz.bitlab.trelloproject.Trelloroject.model.Folders;
import kz.bitlab.trelloproject.Trelloroject.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TasksRepository extends JpaRepository<Tasks,Long> {
    List<Tasks> getTasksById(Long id);
}
