package inheritance.model;

public class Programmer extends Employee {

   public int signUpBonus = 1000; //Bonus is private by default

   // Method prinSalary overrides the behaviour of that from interfaces.model.Employee class
   @Override
   public float printSalary() {
      return salary + signUpBonus;
   }
}
