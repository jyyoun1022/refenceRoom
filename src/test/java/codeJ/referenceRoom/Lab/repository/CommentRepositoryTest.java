//package codeJ.referenceRoom.Lab.repository;
//
//import codeJ.referenceRoom.Lab.bidirectional.demospringdata.Comment;
//import codeJ.referenceRoom.Lab.bidirectional.demospringdata.repository.CommentRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//public class CommentRepositoryTest {
//
//    @Autowired
//    CommentRepository commentRepository;
//
//    @Test
//    void crud(){
//        Comment comment = new Comment();
//        comment.setComment("HelloComment");
//        commentRepository.save(comment);
//
//        List<Comment> all = commentRepository.findAll();
//
//    }
//}
