
public class Circle implements Shape {
    private double radius;
    private Colours colour;

    Circle(int radius, Colours color) {
        this.colour = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public String getArea() {
        double s = Math.PI * (radius * radius);

        if (s > 0 && radius > 0)
            return String.valueOf(s);
        else return "Cant calculate area. Maybe circle is impossible?";
    }

    @Override
    public Colours getColour() {
        return colour;
    }

    double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + getArea() +
                ", colour=" + getColour() +
                ", radius=" + getRadius() +
                '}';
    }
}
