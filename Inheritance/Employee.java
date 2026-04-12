class Employee {
    String name;
    double salary;

    void work() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println("Managing team");
    }
}