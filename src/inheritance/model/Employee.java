package inheritance.model;

public class Employee {

    public float salary = 4000; // Salary is private by default

    // Default public method printSalary()
    public float printSalary() {
        return salary;
    }

    // Overload printSalary(float salary)
    public float printSalary(float salary) {
        // this.salary refers to the public float salary on ln 5
        // while salary refers to the float salary in the ()
        this.salary = salary;
        return salary;
    }
}
