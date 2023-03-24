abstract public class Shape {
    protected Drawing drawing1;

    protected Shape(Drawing d1) {
        this.drawing1 = d1;
    }

    abstract public void drawShape();
}
