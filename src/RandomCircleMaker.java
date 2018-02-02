
class RandomCircleMaker implements ShapeMaker {
    @Override
    public Shape getShape() {
//        Random random = new Random();
        return new Circle(RANDOM.nextInt(100), Colours.values()[RANDOM.nextInt(Colours.values().length)]);
    }
}
