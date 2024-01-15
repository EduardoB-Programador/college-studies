package controller;

import model.Student;
import model.Professor;

/**Português
 * Passo 1 - Criar um projeto chamado 08.1_ExercícioEscola
 *      Criei o OOP-2nd-PDF
 *
 * Passo 2 - Criar as classes Aluno e Professor (não esquecer do padrão MVC)
 *      Criadas Professor e Student no pacote model
 *
 * Aluno:
 * Nome, Telefone, CPF, Data de nascimento, Matrícula
 *
 * Professor
 * Nome, Telefone, Registro Funcional, Data de nascimento
 *
 * Passo 3 - Cadastrar 8 Alunos e 3 Professores
 *
 * Passo 4 - Exibir todos no final
 **/
/**English
 * Step 1: Create a project called "08.1_ExercícioEscola" (08.1_ExerciseSchool)
 *      I Created the project called OOP-2nd-PDF
 *
 * Step 2: Create the classes Student and Professor (Create the standard packages MVC)
 *      I created the classes in the model package
 *
 * Student
 * Name, Phone number, ID, Date of birth, School ID
 *
 * Professor
 * Name, Phone number, Document, Date of birth
 *
 * Step 3: Create 8 Students and 3 Professors
 * Step 4: Show all of them at the end
 **/

public class Atividade {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setName("Livia");
        student1.setPhoneNumber(333444555);
        student1.setBirthDate("01/01/2000");
        student1.setID(123123123);
        student1.setSchoolID(123456789);

        Student student2 = new Student();

        student2.setName("Mary");
        student2.setPhoneNumber(111222333);
        student2.setBirthDate("02/02/2000");
        student2.setID(111222333);
        student2.setSchoolID(11222333);

        Student student3 = new Student();

        student3.setName("Laura");
        student3.setPhoneNumber(132313231);
        student3.setBirthDate("03/03/2000");
        student3.setID(132313231);
        student3.setSchoolID(132313231);

        Student student4 = new Student();

        student4.setName("Maurice");
        student4.setPhoneNumber(321321321);
        student4.setBirthDate("04/04/2000");
        student4.setID(321321321);
        student4.setSchoolID(321321321);

        Student student5 = new Student();

        student5.setName("Lucas");
        student5.setPhoneNumber(123654456);
        student5.setBirthDate("05/05/2000");
        student5.setID(123654456);
        student5.setSchoolID(123654456);

        Student student6 = new Student();

        student6.setName("Subaru");
        student6.setPhoneNumber(987654321);
        student6.setBirthDate("01/04/2000");
        student6.setID(987654321);
        student6.setSchoolID(987654321);

        Student student7 = new Student();

        student7.setName("Franz");
        student7.setPhoneNumber(456654456);
        student7.setBirthDate("06/06/2000");
        student7.setID(456654456);
        student7.setSchoolID(456654456);

        Student student8 = new Student();

        student8.setName("Hychilaa");
        student8.setPhoneNumber(123987456);
        student8.setBirthDate("07/07/2000");
        student8.setID(123987456);
        student8.setSchoolID(123987456);

        Professor professor1 = new Professor();

        professor1.setName("Franz Liszt");
        professor1.setPhoneNumber(123456987);
        professor1.setBirthDate("08/08/1980");
        professor1.setDocument(123456987);

        Professor professor2 = new Professor();

        professor2.setName("Albert Einstein");
        professor2.setPhoneNumber(123654987);
        professor2.setBirthDate("14/03/1879");
        professor2.setDocument(123654987);

        Professor professor3 = new Professor();

        professor3.setName("Reinhard Van Astrea");
        professor3.setPhoneNumber(987654123);
        professor3.setBirthDate("02/29/1990");
        professor3.setDocument(987654123);

        System.out.println("Students:\n" +
                student1 + "\n" +
                student2 + "\n" +
                student3 + "\n" +
                student4 + "\n" +
                student5 + "\n" +
                student6 + "\n" +
                student7 + "\n" +
                student8 + "\n" +
                "Professors:\n" +
                professor1 + "\n" +
                professor2 + "\n" +
                professor3);

    }
}
