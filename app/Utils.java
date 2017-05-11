import java.util.Random;

/**
 * Created by stus on 11.05.17.
 */
public class Utils {
    public static float getRandomFloatNum() {
        return 1 / (new Random().nextInt(99) + 1);
    }
}
