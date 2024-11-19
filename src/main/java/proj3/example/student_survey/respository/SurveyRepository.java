package proj3.example.student_survey.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj3.example.student_survey.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

}
