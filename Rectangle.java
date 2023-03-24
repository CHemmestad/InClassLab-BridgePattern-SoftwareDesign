public class Rectangle extends Shape {
    public Rectangle(Drawing d1) {
        super(d1);
    }
    @Override
    public void drawShape() {
        System.out.println("Drawing a rectangle:");
        drawing1.draw();
    }
}
