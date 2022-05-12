//package codeJ.referenceRoom.Lab.bidirectional.demospringdata;
//
//import codeJ.referenceRoom.Lab.bidirectional.demospringdata.Account;
//import codeJ.referenceRoom.Lab.bidirectional.demospringdata.repository.PostRepository;
//import org.hibernate.Session;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@Component
//@Transactional
//public class JpaRunner implements ApplicationRunner {
//
//   @Autowired
//    PostRepository postRepository;
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
////        Post post = new Post();
////        post.setTitle("Spring Data Jpa 언제보나...");
////
////        Comment comment = new Comment();
////        comment.setComment("빨리 보고 싶어요");
////        post.addComment(comment);
////
////        Comment comment1 = new Comment();
////        comment1.setComment("곧 보여드릴게요");
////        post.addComment(comment1);
////
////        Session session = entityManager.unwrap(Session.class);
////        session.save(post);
////        TypedQuery<Post> query = entityManager.createQuery("SELECT p FROM Post AS p", Post.class);
////        List<Post> posts = query.getResultList();
////        posts.forEach(System.out::println);
//        postRepository.findAll().forEach(System.out::println);
//    }
//}
