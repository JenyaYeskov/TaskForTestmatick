import java.util.Random;

public class Main {
    public static void main(String[] args) {
//      Задані фігури

        Shape square = new Square(5, Colours.BLACK);
        System.out.println(square.toString());

        Shape triangle = new Triangle(37, 12, 35, Colours.GREY);
        System.out.println(triangle.toString());

        Shape trapezoid = new Trapezoid(4, 5, 3, 3, Colours.BLUE);
        System.out.println(trapezoid.toString());

        Shape circle = new Circle(5, Colours.RED);
        System.out.println(circle.toString());

        System.out.println();



//      Випадково згенерований масив фігур

        Random random = new Random();
        Shape[] shapesArray = new Shape[random.nextInt(100)];
//        int selector;
//        ShapeMaker[] shapeMakers = new ShapeMaker[4];
//
//        shapeMakers[0] = new RandomCircleMaker();
//        shapeMakers[1] = new RandomSquareMaker();
//        shapeMakers[2] = new RandomTriangleMaker();
//        shapeMakers[3] = new RandomTrapezoidMaker();

        RandomShapeMaker rndshpmkr = new RandomShapeMaker();




        for (int i = 0; i < shapesArray.length; i++) {
//            selector = random.nextInt(4);

//            shapesArray[i] = shapeMakers[selector].getShape();

            shapesArray[i] = rndshpmkr.getRandomShape();

            System.out.println(i + 1 + " " + shapesArray[i].toString());
        }

    }


}
