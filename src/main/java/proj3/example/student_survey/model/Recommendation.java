package proj3.example.student_survey.model;

public enum Recommendation {
	VERY_LIKELY("Very Likely"),
    LIKELY("Likely"),
    UNLIKELY("Unlikely");

    private final String value;

    Recommendation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
