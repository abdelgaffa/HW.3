import java.util.Scanner;

abstract class Person {
    String name;
    double salary;
    int age;
    String socialStatus;
    String dob;
    String jobType;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("Social Status: " + socialStatus);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Job Type: " + jobType);
    }
}