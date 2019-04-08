package polymorphism.shape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.print("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.print("Square.erase()");
    }
}