import java.util.*;
import java.lang.Math;
import java.lang.Long;

public class DividedByZero
{
    public static void main(String[] args)
    {
        double x = 0.0;
        int y = (int) Math.ceil(Long.valueOf(23) / x);
        System.out.println(y);
    }
}

