public class Circle extends Shape {
    public Circle(Drawing d1) {
        super(d1);
    }
    @Override
    public void drawShape() {
        System.out.println("Drawing a circle:");
        drawing1.draw();
    }
}
