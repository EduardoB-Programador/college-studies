package model;

public class Student extends Person {

    //schoolID is not in superclass because it's suppose to be different things for students and professors
    //besides the variable name being the same
    private String schoolID, studyField;

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
    }

    public String getStudyField() {
        return studyField;
    }

    public Student() {
        super();
    }

    public Student(String name, String secNumber, String id,
            String phoneNumber, String email, String schoolID, String studyField) {

        super();
        this.setName(name);
        this.setSecNumber(secNumber);
        this.setID(id);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.schoolID = schoolID;
        this.studyField = studyField;
    }

    @Override
    public String toString() {
        return "\nStudent: " + super.toString() +
                "\nSchool ID: " + schoolID +
                "\nStudy field: " + studyField +
                "\n----------------------------------------------------";
    }
}
