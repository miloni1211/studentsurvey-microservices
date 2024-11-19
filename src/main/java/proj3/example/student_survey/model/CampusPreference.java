package proj3.example.student_survey.model;

public enum CampusPreference {
	STUDENTS("students"),
    LOCATION("location"),
    CAMPUS("campus"),
    ATMOSPHERE("atmosphere"),
    DORM_ROOMS("dorm rooms"),
    SPORTS("sports");

    private final String value;

    CampusPreference(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
