package codeJ.referenceRoom.Lab.ManyToMany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
