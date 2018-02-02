/**
 * Created by ${Zhenya} on 001 01.02.18.
 */
public class RandomSquareMaker implements ShapeMaker {
    @Override
    public Shape getShape() {
//        Random random = new Random();
        return new Square(RANDOM.nextInt(100), Colours.values()[RANDOM.nextInt(Colours.values().length)]);
    }
}
