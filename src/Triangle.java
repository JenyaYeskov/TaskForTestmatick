
public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private Colours colour;

    Triangle(double sideA, double sideB, double sideC, Colours color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.colour = color;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }

    @Override
    public String getArea() {
        double p = (sideA + sideB + sideC) / 2;
        double s = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

//        Перевірка чи трикутник можливий

        if (s > 0  && sideA > 0 && sideB > 0 && sideC > 0)
            return String.valueOf(s);
        else return "Cant calculate area. Maybe triangle is impossible?";
    }

    @Override
    public Colours getColour() {
        return colour;
    }

    private String getHypotenuse() {

        // Перевірка чи трикутник прямокутний. Гіпотенуза може бути тільки у прямокутних трикутників.

        if (Math.hypot(sideA, sideB) == sideC)
            return Double.toString(Math.hypot(sideA, sideB));

        else if (Math.hypot(sideA, sideC) == sideB)
            return Double.toString(Math.hypot(sideA, sideC));

        else if (Math.hypot(sideC, sideB) == sideA)
            return Double.toString(Math.hypot(sideC, sideB));

        else return "Cant calculate hypotenuse. Maybe triangle is not right?";
    }

    @Override
    public String toString() {

        return "Triangle{" +
                "area=" + getArea() +
                ", colour=" + colour +
                ", hypotenuse=" + getHypotenuse() +
                '}';

    }
}
