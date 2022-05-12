package codeJ.referenceRoom.Lab.CostumRepository;

import java.util.List;

public interface PostCustomRepository<T> {

    List<Postarg> findMyPost();

     void delete(T entity);
}
