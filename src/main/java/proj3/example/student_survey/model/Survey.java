package proj3.example.student_survey.model;

import jakarta.persistence.*;
import java.util.Date;




@Entity
@Table(name = "surveydata")
public class Survey {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "first_Name", nullable = false)
	    private String first_Name;

	    @Column(name = "last_Name", nullable = false)
	    private String last_Name;

	    @Column(name = "street_Address", nullable = false)
	    private String street_Address;

	    @Column(name = "city", nullable = false)
	    private String city;

	    @Column(name = "state", nullable = false)
	    private String state;

	    @Column(name = "zip", nullable = false)
	    private int zip;

	    @Column(name = "tele_Number", nullable = false)
	    private long tele_Number;

	    @Column(name = "email", nullable = false)
	    private String email;

	    @Column(name = "survey_date", nullable = false)
	    @Temporal(TemporalType.DATE)
	    private Date survey_date;

	    @Column(name = "likes_about_campus", nullable = false)
	    private String likes_about_campus;

	    @Column(name = "interested_in_uni", nullable = false)
	    private String interested_in_uni;

	    @Column(name = "recommend", nullable = false)
	    private String recommend;

    
    //getters and setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return first_Name;
    }

    public void setFirstName(String firstName) {
        this.first_Name = firstName;
    }

    public String getLastName() {
        return last_Name;
    }

    public void setLastName(String lastName) {
        this.last_Name = lastName;
    }

    public String getStreetAddress() {
        return street_Address;	
    }

    public void setStreetAddress(String streetAddress) {
        this.street_Address = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getTeleNumber() {
        return tele_Number;
    }

    public void setTeleNumber(long teleNumber) {
        this.tele_Number = teleNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getSurveyDate() {
        return survey_date;
    }

    public void setSurveyDate(Date surveyDate) {
        this.survey_date = surveyDate;
    }

    public String getLikesAboutCampus() {
        return likes_about_campus;
    }

    public void setLikesAboutCampus(String likesAboutCampus) {
        this.likes_about_campus = likesAboutCampus;
    }

    public String getInterestedInUni() {
        return interested_in_uni;
    }

    public void setInterestedInUni(String interestedInUni) {
        this.interested_in_uni = interestedInUni;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
    
    
    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", street_Address='" + street_Address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", tele_Number=" + tele_Number +
                ", email='" + email + '\'' +
                ", survey_date=" + survey_date +
                ", likes_about_campus=" + likes_about_campus +
                ", interested_in_uni=" + interested_in_uni +
                ", recommend=" + recommend +
                '}';
    }

    
}
