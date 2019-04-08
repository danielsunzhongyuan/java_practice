

public class CartoonPracticeFour {
    public static void main(String[] args) {
        Cartoon c = new Cartoon();
    }
}

class Art {
    Art() {
        System.out.println("Art constructor()");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor()");
    }
}

class Cartoon extends Drawing {
//    Cartoon() {
//        System.out.println("Cartoon constructor()");
//    }
}
