package abstractclass.shape.model;

public abstract class Shape {

    // Method signature to calculate area
    public abstract float calculateArea();


    // Method signature to calculate perimeter
    public abstract float calculatePerimeter();

    public void displayPerimeter(String type, float value){
        System.out.println(type + "Perimeter: " + value);
    }


    public void displayArea(String type, float value){
        System.out.println(type + "Area: " + value);
    }
}
