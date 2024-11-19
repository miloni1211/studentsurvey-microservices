package proj3.example.student_survey.model;

public enum InterestSource {
	FRIENDS("friends"),
    TELEVISION("television"),
    INTERNET("Internet"),
    OTHER("other");

    private final String value;

    InterestSource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
