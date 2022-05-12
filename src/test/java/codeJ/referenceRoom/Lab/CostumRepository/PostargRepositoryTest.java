package codeJ.referenceRoom.Lab.CostumRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostargRepositoryTest {

    @Autowired
    PostargRepository repository;

    @Test
    void crud(){;
        repository.findMyPost();
        Postarg postarg = new Postarg();
        postarg.setTitle("hibernate");
        repository.save(postarg);
        repository.delete(postarg);
    }

}