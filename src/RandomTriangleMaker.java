/**
 * Created by ${Zhenya} on 001 01.02.18.
 */
public class RandomTriangleMaker implements ShapeMaker {
    @Override
    public Shape getShape() {
//        Random random = new Random();
        return new Triangle(RANDOM.nextInt(10), RANDOM.nextInt(10), RANDOM.nextInt(10),
                Colours.values()[RANDOM.nextInt(Colours.values().length)]);
    }
}
