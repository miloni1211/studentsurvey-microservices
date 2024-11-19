package proj3.example.student_survey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proj3.example.student_survey.model.Survey;
import proj3.example.student_survey.service.SurveyService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    // Create a new survey
   /* @PostMapping
    public ResponseEntity<Survey> createSurvey(@RequestBody Survey survey) {
        Survey createdSurvey = surveyService.saveSurvey(survey);
        return new ResponseEntity<>(createdSurvey, HttpStatus.CREATED);
    }
*/
    
    @PostMapping
    public ResponseEntity<Survey> createSurvey(@RequestBody Survey survey) {
        System.out.println("Received Survey: " + survey); // Add this line for debugging
        Survey createdSurvey = surveyService.saveSurvey(survey);
        return new ResponseEntity<>(createdSurvey, HttpStatus.CREATED);
    }

    
    
    // Get all surveys
    @GetMapping
    public List<Survey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }

    // Get survey by ID
    @GetMapping("/{id}")
    public ResponseEntity<Survey> getSurveyById(@PathVariable Long id) {
        Optional<Survey> survey = surveyService.getSurveyById(id);
        return survey.map(ResponseEntity::ok)
                     .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // Update an existing survey
    @PutMapping("/{id}")
    public ResponseEntity<Survey> updateSurvey(@PathVariable Long id, @RequestBody Survey surveyDetails) {
        Optional<Survey> existingSurvey = surveyService.getSurveyById(id);
        if (existingSurvey.isPresent()) {
            surveyDetails.setId(id);  // Set the ID to ensure we update the correct record
            Survey updatedSurvey = surveyService.saveSurvey(surveyDetails);
            return ResponseEntity.ok(updatedSurvey);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a survey by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurvey(@PathVariable Long id) {
        if (surveyService.getSurveyById(id).isPresent()) {
            surveyService.deleteSurveyById(id);
            return ResponseEntity.noContent().build();
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
