package proj3.example.student_survey.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proj3.example.student_survey.model.Survey;
import proj3.example.student_survey.respository.SurveyRepository;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    // Create or Update Survey
    public Survey saveSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    // Read all Surveys
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    // Read Survey by ID
    public Optional<Survey> getSurveyById(Long id) {
        return surveyRepository.findById(id);
    }

    // Delete Survey
    public void deleteSurveyById(Long id) {
        surveyRepository.deleteById(id);
    }
}
