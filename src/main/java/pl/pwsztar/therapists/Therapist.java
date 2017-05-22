package pl.pwsztar.therapists;


/**
 * Created by Lapek on 16.05.2017.
 */
public class Therapist {

    private Integer therapistId;
    private String firstName;
    private String lastName;
    private String email;
    private String specialization;
    private String description;
    private String googleCalendarId;
    private String telephone;


    public Integer getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(Integer therapistId) {
        this.therapistId = therapistId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGoogleCalendarId() {
        return googleCalendarId;
    }

    public void setGoogleCalendarId(String googleCalendarId) {
        this.googleCalendarId = googleCalendarId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
