import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[9];
        people[0] = new Engineer("John", 5000, 30, "Married", "01/01/1993");
        people[1] = new Engineer("Sarah", 6000, 35, "Single", "05/20/1988");
        people[2] = new Engineer("David", 5500, 28, "Married", "09/15/1995");
        people[3] = new Employee("Emma", 4000, 25, "Single", "12/31/1998");
        people[4] = new Employee("Michael", 4500, 32, "Married", "06/18/1989");
        people[5] = new Employee("Sophia", 4200, 27, "Single", "03/10/1994");
        people[6] = new Worker("James", 3000, 22, "Single", "11/05/2001");
        people[7] = new Worker("Ava", 3200, 24, "Married", "07/12/1997");
        people[8] = new Worker("William", 2800, 20, "Single", "02/22/2003");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose a job type: (1) Engineer, (2) Employee, (3) Worker, or (4) Exit");
            int jobTypeChoice = scanner.nextInt();

            if (jobTypeChoice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Please choose a person: (1) " + people[(jobTypeChoice - 1) * 3].name + ", (2) " + people[(jobTypeChoice - 1) * 3 + 1].name + ", or (3) " + people[(jobTypeChoice - 1) * 3 + 2].name);
            int personChoice = scanner.nextInt();

            if (personChoice < 1 || personChoice > 3) {
                System.out.println("Invalid choice.");
                continue;
            }

            Person chosenPerson = people[(jobTypeChoice - 1) * 3 + personChoice - 1];
            chosenPerson.displayInfo();
        }
    }
}