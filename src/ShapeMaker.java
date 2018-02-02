import java.util.Random;

public interface ShapeMaker {
    Random RANDOM = new Random();

    Shape getShape();
}
