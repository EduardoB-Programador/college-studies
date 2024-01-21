package model;

public class Professor extends Person {

    //schoolID is not in superclass because it's suppose to be different things for students and professors
    //besides the variable name being the same
    private String schoolID, subject;

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public Professor() {
        super();
    }

    public Professor(String name, String secNumber, String id,
            String phoneNumber, String email, String schoolID, String subject) {

        super();
        setName(name);
        setSecNumber(secNumber);
        setID(id);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        this.schoolID = schoolID;
        this.subject = subject;

    }

    @Override
    public String toString() {
        return "\nProfessor: " + super.toString() +
                "\nSchool ID: " + schoolID +
                "\nSubject: " + subject +
                "\n----------------------------------------------------";
    }
}
