package inheritance.model;


public class Main {
    public static void main(String[] args) {

        // Create a new instance of Programmer
        Programmer programmer = new Programmer();
        System.out.println("Programmer's Salary " + programmer.printSalary());
        //System.out.println("Programmer's Bonus " + programmer.bonus);

        Programmer programmer2 = new Programmer();
        System.out.println(programmer2.printSalary(6000));
    }
}