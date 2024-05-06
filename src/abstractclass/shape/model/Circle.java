package abstractclass.shape.model;

public class Circle extends Shape{

    // By default below is a private variable
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * Math.PI * radius);
    }
}
