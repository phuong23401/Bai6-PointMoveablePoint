public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint point1 = new MoveablePoint();
        MoveablePoint point2 = new MoveablePoint(2.3f, 4.0f);
        MoveablePoint point3 = new MoveablePoint(1.0f, 2.0f, 3.0f, 4.0f);

        System.out.println("Point1: " + point1);
        System.out.println("Point2: " + point2);
        System.out.println("Point3: " + point3);

        System.out.println(point3.move(2.0f, 3.0f));
    }
}
