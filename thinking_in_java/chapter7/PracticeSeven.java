public class PracticeSeven {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    A(int i) {
        System.out.println("A constructor");
    }
}

class B {
    B(int i) {
        System.out.println("B constructor");
    }
}

class C extends A {
    private B b = new B(2);

    C() {
        super(1);
    }
}
