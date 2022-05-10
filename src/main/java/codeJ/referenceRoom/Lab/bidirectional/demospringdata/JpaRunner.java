package codeJ.referenceRoom.Lab.bidirectional.demospringdata;

import codeJ.referenceRoom.Lab.bidirectional.demospringdata.Account;
import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Account account = new Account();
        account.setUsername("keesun2");
        account.setPassword("jpa123");

        Study study = new Study();
        study.setName("springDataJPA");
        study.setOwner(account);


        Session session = entityManager.unwrap(Session.class);

        session.save(account);
        session.save(study);

    }
}
