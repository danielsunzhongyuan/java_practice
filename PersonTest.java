import java.util.*;

public class PersonTest
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];

        people[0] = new Employee("Harry Hacker", 5000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        for (Person p : people)
        {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}

abstract class Person
{
    public Person(String n)
    {
        name = n;
    }

    public abstract String getDescription();

    public String getName()
    {
        return name;
    }

    private String name;
}

class Employee extends Person
{
    public Employee(String n, double s, int year, int month, int day)
    {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireday()
    {
        return hireDay;
    }

    public String getDescription()
    {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    private double salary;
    private Date hireDay;
}

class Student extends Person
{
    public Student(String n, String m)
    {
        super(n);
        major = m;
    }

    public String getDescription()
    {
        return "a student majoring in " + major;
    }

    private String major;
}
