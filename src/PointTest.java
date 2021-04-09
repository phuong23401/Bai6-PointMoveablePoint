import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(1.0f, 2.0f);

        System.out.println("Point1: " + point1);
        System.out.println("Point2: " + point2);

        System.out.println(Arrays.toString(point2.getXY(new float[] {2, 4})));
    }
}
