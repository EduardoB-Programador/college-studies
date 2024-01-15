package model;
//2
public class Student {

    private String name, birthDate;
    private int id, schoolID, phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getID() {
        return id;
    }

    public int getSchoolID() {
        return schoolID;
    }

    @Override
    public String toString() {
        return "-----------------------------------------------------" +
                "\nStudent:" +
                "\nName: " + name +
                "\nPhone Number: " + phoneNumber +
                "\nDate of Birth: " + birthDate +
                "\nID: " + id +
                "\nSchool ID: " + schoolID +
                "\n-----------------------------------------------------";
    }
}
