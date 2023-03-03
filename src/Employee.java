class Employee extends Person {
    Employee(String name, double salary, int age, String socialStatus, String dob) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.socialStatus = socialStatus;
        this.dob = dob;
        this.jobType = "Employee";
    }
}