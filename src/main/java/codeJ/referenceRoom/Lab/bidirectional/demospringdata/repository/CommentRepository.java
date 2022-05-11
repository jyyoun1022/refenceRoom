package codeJ.referenceRoom.Lab.bidirectional.demospringdata.repository;

import codeJ.referenceRoom.Lab.bidirectional.demospringdata.Comment;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = Comment.class, idClass = Long.class)
public interface CommentRepository {

    Comment save ( Comment comment);

    List<Comment> findAll();
}
