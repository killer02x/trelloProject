package kz.bitlab.trelloproject.Trelloroject.repository;

import kz.bitlab.trelloproject.Trelloroject.model.Comments;
import kz.bitlab.trelloproject.Trelloroject.model.Folders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface FoldersRepository extends JpaRepository<Folders,Long> {
}
