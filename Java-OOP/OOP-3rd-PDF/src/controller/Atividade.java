package controller;

import model.Person;
import model.Student;
import model.Professor;

public class Atividade {
    public static void main(String[] args) {

        Student student1 = new Student("John", "333222555", "325", "3322-5555",
                "Johnnf00l@smart.com", "CS001", "Computer Science");

        Professor professor1 = new Professor("Kim", "111444999", "149",
                "1144-9999", "kimisinusall@smart.com", "PSD001",
                "Software Development");

        System.out.println(student1.toString() + professor1.toString());

    }
}
