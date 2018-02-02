
public class RandomTrapezoidMaker implements ShapeMaker {
    @Override
    public Shape getShape() {
//        Random random = new Random();
        return new Trapezoid(RANDOM.nextInt(10), RANDOM.nextInt(10), RANDOM.nextInt(10),
                RANDOM.nextInt(10), Colours.values()[RANDOM.nextInt(Colours.values().length)]);
    }
}
