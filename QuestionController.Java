package testvagrant.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testvagrant.entity.Question;
import testvagrant.service.QuestionService;

@RestController
@RequestMapping(path = "/que")
public class QuestionController {
   @Autowired
   QuestionService questionService;
   @GetMapping("/question")
   public List<Question> getAllQuestion(){
      return null;
   }
   @GetMapping("/question/{year}")
   public Question getQuestion(@PathVariable("year") int id) {
      return null;
   }
   @PostMapping("/question")
   public void addQuestion(@RequestBody Question question) {
   }	
}
