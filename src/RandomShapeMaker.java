import java.util.Random;

class RandomShapeMaker {
    Shape getRandomShape() {

        Random random = new Random();
        int selector;
        ShapeMaker[] shapeMakers = new ShapeMaker[4];

        shapeMakers[0] = new RandomCircleMaker();
        shapeMakers[1] = new RandomSquareMaker();
        shapeMakers[2] = new RandomTriangleMaker();
        shapeMakers[3] = new RandomTrapezoidMaker();

        selector = random.nextInt(4);

        return shapeMakers[selector].getShape();
    }
}
