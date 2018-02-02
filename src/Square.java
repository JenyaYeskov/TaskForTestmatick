/**
 * Created by ${Zhenya} on 031 31.01.18.
 */
public class Square implements Shape {

    private double side;
    private Colours colour;

    Square(double side, Colours color) {
        this.side = side;
        this.colour = color;
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }

    @Override
    public String getArea() {
        double s = side * side;

        if (s > 0 )
            return String.valueOf(s);
        else return "Cant calculate area. Maybe square is impossible?";
    }

    @Override
    public Colours getColour() {
        return colour;
    }

    double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + getArea() +
                ", color='" + getColour() + '\'' +
                ", side=" + getSide() +
                '}';
    }
}
