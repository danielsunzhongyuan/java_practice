public class PracticeFive {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    A() {
        System.out.println("A constructor");
    }
}

class B {
    B() {
        System.out.println("B constructor");
    }
}

class C extends A {
    private B b = new B();
}
