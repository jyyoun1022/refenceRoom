package codeJ.referenceRoom.Lab.bidirectional.demospringdata.repository;

import codeJ.referenceRoom.Lab.bidirectional.demospringdata.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {

//    @PersistenceContext
//    EntityManager entityManager;
//
//    public Post add(Post post){
//        entityManager.persist(post);
//        return post;
//    }
//
//    public void delete(Post post){
//        entityManager.remove(post);;
//    }
//
//    public List<Post> findAll(){
//        return entityManager.createQuery("SELECT p FROM Post As p",Post.class)
//                .getResultList();
//    }
//


}
