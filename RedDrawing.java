// Child class of interface class type and inherits those attributes
public class RedDrawing implements Drawing { //Implements is used for interface types only, which only contain abstract methods
// Sort of like a special case of inheritance and essentially making a child class that inherits the parent class that is a interface type
    @Override
    public void draw() {
        System.out.println("Drawing in red");
    }
}
