package testvagrant.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import testvagrant.entity.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer>  {
}