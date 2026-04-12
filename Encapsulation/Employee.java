class Employee {
    private String name;
    private double salary;

    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }
}