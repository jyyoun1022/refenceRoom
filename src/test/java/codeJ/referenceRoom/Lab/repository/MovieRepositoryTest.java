package codeJ.referenceRoom.Lab.repository;

import codeJ.referenceRoom.Lab.ManyToMany.Movie;
import codeJ.referenceRoom.Lab.ManyToMany.MovieRepository;
import codeJ.referenceRoom.Lab.ManyToMany.Poster;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@SpringBootTest
@Log4j2
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository repository;

    @Test
    public void testInsert(){

        Movie movie = Movie.builder().title("극한직업").build();

        movie.addPoster(Poster.builder().frame("극한직업포스터1.jpg").build());
        movie.addPoster(Poster.builder().frame("극한직업포스터2.jpg").build());

        repository.save(movie);

        log.info(movie.getMno());

    }

    @Test
    @Transactional
    @Commit
    public void testAddPoster() {

        Optional<Movie> result = repository.findById(1L);

        if (result.isPresent()) {
            Movie movie = result.get();
            movie.addPoster(Poster.builder().frame("극한직업 포스터3.jpg").build());

            repository.save(movie);
        }

    }
    @Test
    @Transactional
    @Commit
    void testRemovePoster(){
        Optional<Movie> result = repository.findById(1L);
        if(result.isPresent()){
            Movie movie = result.get();
            movie.removePoster(2L);
            repository.save(movie);
        }
    }

}
