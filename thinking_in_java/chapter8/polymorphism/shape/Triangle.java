package polymorphism.shape;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.print("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.print("Triangle.erase()");
    }

    @Override
    public void wheels() {
        System.out.print("Triangle.wheels()");
    }
}