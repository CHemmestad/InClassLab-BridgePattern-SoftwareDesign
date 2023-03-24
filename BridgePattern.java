public class BridgePattern {
    public static void main(String[] Args) {
        Shape shape1 = new Rectangle(new RedDrawing());
        Shape shape2 = new Circle(new BlueDrawing());
        shape1.drawShape();
        shape2.drawShape();
    }
}