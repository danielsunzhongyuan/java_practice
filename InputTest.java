import java.util.*;

public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("What's your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Salary?");
        double salary = in.nextDouble();

        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
        System.out.printf("Your salary is %,(8f", salary);
    }
}
