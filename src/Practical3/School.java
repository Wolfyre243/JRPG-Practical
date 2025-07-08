package Practical3;

import javax.swing.JOptionPane;

import java.util.*;

public class School {
    // used to store lecturer or student objects
    private Person[] persons;
    // used to keep track of the number of people
    private int numOfPeople;

    public School() {
        numOfPeople = 0; // School is empty initially
        populateSchool();
        displayPopulation();
    }

    public void populateSchool(){
        String inStr = JOptionPane.showInputDialog(
        null,
        "Enter number of people to create: ",
        "School",
        JOptionPane.QUESTION_MESSAGE);

        int size = Integer.parseInt(inStr);
        //create Persons array with the size
        //entered by the user
        numOfPeople = Integer.parseInt(inStr);
        this.persons = new Person[size];
        // Use a loop, in the loop:
        //
        // (1) Generate a random number from 1 to 2
        // (2) If number is 1,
        //add a student object to the persons array.
        //You will need to call createStudent() method.
        // (3) If the number is 2,
        //add a lecturer object to the persons array.
        //You will need to call createLecturer() method.
        System.out.println(persons.length);
        for (int i = 0; i < persons.length; i++) {
            Random random = new Random();
            final int randomNum = random.nextInt(1) + 1;
            if (randomNum == 1) {
                createStudent();
            } else if (randomNum == 2) {
                createLecturer();
            }
        }
        System.out.println(this.persons.toString());
    }

    public void createStudent() {
        String name = JOptionPane.showInputDialog(
                null,
                "Enter Name:",
                "School - Create Student",
                JOptionPane.QUESTION_MESSAGE);
        String inStr = JOptionPane.showInputDialog(
                null,
                "Enter year of Study:",
                "School - Create Student",
                JOptionPane.QUESTION_MESSAGE);
        // Create a Student object based on the values entered
        // and store the object in the persons array
        // List<Person> tempList = new ArrayList<Person>(Arrays.asList(persons));
        // tempList.add(new Student(name, inStr.charAt(0)));
        // persons = tempList.toArray(persons);
        persons[persons.length - 1] = new Student(name, inStr.charAt(0));
        // System.out.println(persons.toString());
    }

    public void createLecturer() {
        // Write the code needed to create a lecturer object.
        // It will prompts the user to enter the no. of modules
        // and the module code(s) that the lecturer is teaching.
        // For example, if the lecturer teaches 3 modules,
        // it will prompt the user to enter the module code 3
        // times.
        // It then creates a Lecturer object and
        // stores in the persons array
        String name = JOptionPane.showInputDialog(
                null,
                "Enter Name:",
                "School - Create Lecturer",
                JOptionPane.QUESTION_MESSAGE);
        String modNum = JOptionPane.showInputDialog(
                null,
                "Enter number of modules:",
                "School - Create Lecturer",
                JOptionPane.QUESTION_MESSAGE);

        String[] modArr = new String[Integer.parseInt(modNum)];
        for (int i = 0; i < persons.length; i++) {
            String modStr = JOptionPane.showInputDialog(
                null,
                "Enter module code:",
                "School - Create Lecturer",
                JOptionPane.QUESTION_MESSAGE);

            modArr[i] = modStr;
        }

        persons[persons.length - 1] = new Lecturer(name, modArr);
    }

    public void displayPopulation(){
        // Write the code to display the information about
        // each person in the school.
        // It uses the introduce() method in each class
        // to achieve this.
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Person %d:\n", i);
            persons[i].introduce();
        }
    }

    public static void main(String[] args) {
        School school = new School();
        school.displayPopulation();
    }
}
class Person {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void introduce() {
        System.out.printf("My name is %s\n", this.name);
    }
}

class Student extends Person {
    private char stdYear;

    public Student(String name, char year) {
        super(name);
        this.stdYear = year;
    }

    public char getYear() {
        return this.stdYear;
    }

    public void introduce() {
        super.introduce();
        System.out.printf("I am a year %c student\n", this.stdYear);
    }
}

class Lecturer extends Person {
    private String[] modules;

    public Lecturer() {
        super();
        this.modules = null;
    }

    public Lecturer(String name, String[] modules) {
        super(name);
        this.modules = modules;
    }

    public String[] getModules() {
        return this.modules;
    }

    public String getModule(int index) {
        return this.modules[index];
    }

    public void introduce() {
        super.introduce();
        System.out.printf("I am the lecturer of the following subjects:\n");
        for (int i = 0; i < modules.length; i++) {
            System.out.printf("%d. %s\n", i + 1, this.modules[i]);
        }
    }
}