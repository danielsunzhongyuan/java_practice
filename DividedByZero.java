import java.util.*;
import java.lang.Math;
import java.lang.Long;

public class DividedByZero {
    public static void main(String[] args) {
        double x = 0;
        int y = (int) Math.ceil(Long.valueOf(0.000000000001) / x);
        System.out.println(y);
    }
}

