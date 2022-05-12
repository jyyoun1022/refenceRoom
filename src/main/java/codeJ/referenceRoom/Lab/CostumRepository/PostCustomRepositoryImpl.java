package codeJ.referenceRoom.Lab.CostumRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class PostCustomRepositoryImpl implements PostCustomRepository<Postarg>{

    @Autowired
    EntityManager entityManager;
    @Autowired
    PostargRepository repository;

    @Override
    public List<Postarg> findMyPost() {
        System.out.println("custom findMyPost");
        return entityManager.createQuery("SELECT p FROM Postarg AS p ",Postarg.class).getResultList();
    }

    @Override
    public void delete(Postarg entity) {
        System.out.println("custom delete");
        repository.delete(entity);
    }
}
