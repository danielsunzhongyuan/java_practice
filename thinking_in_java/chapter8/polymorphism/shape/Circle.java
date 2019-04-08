package polymorphism.shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.print("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.print("Circle.erase()");
    }
}