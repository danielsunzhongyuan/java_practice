interface Cycle {
    void f();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    @Override
    public void f() {
        System.out.println("This is a unicycle.");
    }
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    @Override
    public void f() {
        System.out.println("This is a bicycle.");
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    @Override
    public void f() {
        System.out.println("This is a tricycle.");
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class Cycles {
    public static void runCycle(CycleFactory cycleFactory) {
        Cycle c = cycleFactory.getCycle();
        c.f();
    }

    public static void main(String[] args) {
        runCycle(new UnicycleFactory());
        runCycle(new BicycleFactory());
        runCycle(new TricycleFactory());
    }
}
