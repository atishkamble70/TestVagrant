package testvagrant.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testvagrant.entity.Question;
import testvagrant.repository.QuestionRepository;

@Service
public class QuestionService {
   @Autowired
   QuestionRepository repository;
   public Question getQuestionByYear(int year) {
      return null;
   }
   public List<Question> getAllQuestion(){
      return null;
   }
   public void saveOrUpdate(Question employee) {
   }
}