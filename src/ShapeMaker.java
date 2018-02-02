import java.util.Random;

/**
 * Created by ${Zhenya} on 001 01.02.18.
 */
public interface ShapeMaker {
    Random RANDOM = new  Random();

    Shape getShape();
}
