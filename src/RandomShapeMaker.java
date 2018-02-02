import java.util.Random;

class RandomShapeMaker {
//
//    //    Shape getShape() {
//    private Random random = new Random();
//    int sel = random.nextInt(4);
////
////        if (s == 0)
////            return new Circle(random.nextInt(100), Colours.values()[random.nextInt(Colours.values().length)]);
////        if (s == 1)
////            return new Square(random.nextInt(100), Colours.values()[random.nextInt(Colours.values().length)]);
////        if (s == 2)
////            return new Trapezoid(random.nextInt(10), random.nextInt(10), random.nextInt(10),
////                    random.nextInt(10), Colours.values()[random.nextInt(Colours.values().length)]);
////        if (s == 3)
////            return new Triangle(random.nextInt(10), random.nextInt(10), random.nextInt(10),
////                    Colours.values()[random.nextInt(Colours.values().length)]);
////        else return null;
////    }
//
//    ShapeMaker c = new RandomCircleMaker();
//    ShapeMaker s = new RandomSquareMaker();
//    ShapeMaker trg = new RandomTriangleMaker();
//    ShapeMaker trap = new RandomTrapezoidMaker();
//
//    Shape makeShape(){
//        if (sel == 0)
//            return c.getShape();
//        if (sel == 1)
//            return s.getShape();
//        if (sel == 2)
//            return trg.getShape();
//        if (sel == 3)
//            return trap.getShape();
//        else return null;
//    }

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
