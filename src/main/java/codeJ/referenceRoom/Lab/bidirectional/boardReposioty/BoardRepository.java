package codeJ.referenceRoom.Lab.bidirectional.boardReposioty;

import codeJ.referenceRoom.Lab.bidirectional.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {


}
