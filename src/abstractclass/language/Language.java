package abstractclass.language;

public abstract class Language {

    // Method signature that belong to the Language class
    public abstract void greeting(String value);

    // Method DEFINITION that belongs to the Language Class
    public void welcomeUser(String value){
        System.out.println("Welcome to JAVA OOP " + value);
    }
}

// 1. You CANNOT create an instance of an Abstract class
// 2. You CANNOT create a body for an Abstract method
// 3. But, you CAN create a method definition for a regular method