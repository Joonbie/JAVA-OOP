package abstractclass.shape.model;

public class Triangle extends Shape {

    // Variable x3 sides
    float base;
    float height;
    float side;
    float side2;

    // Constructor to store the variables
    public Triangle(float base, float height, float side, float side2) {
        this.base = base;
        this.height = height;
        this.side = side;
        this.side2 = side2;
    }

    // Public method to cal the area of triable
    @Override
    public float calculateArea() {
        return (float) Math.round(0.5 * base * height);
    }

    // Public method to cal the perimeter of the triangle
    @Override
    public float calculatePerimeter() {
        return (float) Math.round(side + base + side2);
    }
}
