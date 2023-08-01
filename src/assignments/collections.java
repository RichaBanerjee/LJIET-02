package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee
{
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    int id;

    public String getName() {
        return name;
    }

    String name;
    int salary;


}
 class id implements Comparator<Employee>
{
    public int compare(Employee a, Employee b)
    {
        return a.id-b.id;
    }
}
 class name implements Comparator<Employee>
{
    public int compare(Employee a, Employee b)
    {
        return a.getName().compareTo(b.getName());
    }
}
 class salary implements Comparator<Employee>
{
    public int compare(Employee a, Employee b)
    {
        return a.salary-b.salary;
    }
}
public class collections {
    public static void main(String[] args)
    {
        ArrayList<Employee> emp=new ArrayList<Employee>();
        emp.add(new Employee(1,"richa",100));
        emp.add(new Employee(2,"angel",20340));
        emp.add(new Employee(3,"krutika",3030));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                Collections.sort(emp, new id());
                for(int i=0;i<emp.size();i++)
                {
                    System.out.println(emp.get(i));
                }
                break;
            case 2:
                Collections.sort(emp, new name());
                for(int i=0;i<emp.size();i++)
                {
                    System.out.println(emp.get(i));
                }
                break;
            case 3:
                Collections.sort(emp, new salary());
                for(int i=0;i<emp.size();i++)
                {
                    System.out.println(emp.get(i));
                }
                break;
            case 4:
                System.out.println("provide valid choice");
                break;
        }
    }
}
