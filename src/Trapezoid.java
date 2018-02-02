
public class Trapezoid implements Shape {
    private double baseA;
    private double topB;
    private double sideC;
    private double sideD;
    private Colours colour;

    Trapezoid(double baseA, double topB, double sideC, double sideD, Colours color) {
        this.colour = color;
        this.baseA = baseA;
        this.topB = topB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public void draw() {
        System.out.println("It's a trap!");
    }

    @Override
    public String getArea() {
        double p = (baseA + topB + sideC + sideD) / 2;

        double s = ((baseA + topB) / Math.abs(baseA - topB)) * Math.sqrt((p - baseA) * (p - topB) * (p - baseA - sideC)
                * (p - baseA - sideD));

        if (s > 0)
            return String.valueOf(s);
        else return "Cant calculate area. Maybe trapezoid is impossible?";
    }

    @Override
    public Colours getColour() {
        return colour;
    }

    double getMedian() {
        return (baseA + topB) / 2;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "area=" + getArea() +
                ", colour=" + getColour() +
                ", median=" + getMedian() +
                '}';
    }
}
