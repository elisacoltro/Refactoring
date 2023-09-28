public class BridgePatternTest {
    public static void main(String args[]) {
        Shape circle = new Circle(new BlueColor());
        circle.fillColor();

        Shape rectangle = new Rectangle(new GreenColor());
        rectangle.fillColor();
    }
}