package testvagrant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Question {
   @Id
   @Column
   private int Id;
   @Column
   private String question_Description;
   @Column
   private int academic_year;
   @Column
   private String Concepts;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getQuestion_Description() {
	return question_Description;
}
public void setQuestion_Description(String question_Description) {
	this.question_Description = question_Description;
}
public int getAcademic_year() {
	return academic_year;
}
public void setAcademic_year(int academic_year) {
	this.academic_year = academic_year;
}
public String getConcepts() {
	return Concepts;
}
public void setConcepts(String concepts) {
	Concepts = concepts;
}
}