class Tank {
    STATUS status = STATUS.FULL;
    Tank(STATUS s) {
        status = s;
    }

    protected void finalize() {
        if (STATUS.FULL.equals(status)) {
            System.out.println("finalize");
        }
    }

    enum STATUS {
        FULL,
        EMPTY
    }
}


public class FinalizePracticeTen {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Tank t = new Tank(Tank.STATUS.FULL);
        }
        System.gc();
    }
}