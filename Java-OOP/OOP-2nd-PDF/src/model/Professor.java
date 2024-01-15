package model;
//2
public class Professor {
    private String name, birthDate;

    int document,phoneNumber;

    public void setDocument(int document) {
        this.document = document;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocument() {
        return document;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "-----------------------------------------------------" +
                "\nProfessor:" +
                "\nName: " + name +
                "\nPhone Number: " + phoneNumber +
                "\nDate of Birth: " + birthDate +
                "\nDocument: " + document +
                "\n-----------------------------------------------------";
    }
}
