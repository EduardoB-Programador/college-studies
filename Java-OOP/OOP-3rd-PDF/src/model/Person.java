package model;

public class Person {

    private String name, secNumber, id, phoneNumber, email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSecNumber(String secNumber) {
        this.secNumber = secNumber;
    }

    public String getSecNumber() {
        return secNumber;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public void setPhoneNumber(String phoneNUmber) {
        this.phoneNumber = phoneNUmber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Person() {
        super();
    }
     public Person(String name, String secNumber, String id, String phoneNumber, String email) {

        super();
        this.name = name;
        this.secNumber = secNumber;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;

     }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nSecurity Number: " + secNumber +
                "\nID: " + id +
                "\nPhone NUmber: " + phoneNumber +
                "\nEmail: " + email;
    }
}
