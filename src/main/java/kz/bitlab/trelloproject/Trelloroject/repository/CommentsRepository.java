package kz.bitlab.trelloproject.Trelloroject.repository;

import kz.bitlab.trelloproject.Trelloroject.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CommentsRepository extends JpaRepository<Comments,Long> {
}
