import java.util.Scanner;

public class circle {


    int radius;
    final double pi=3.14;
    public double circumference()
    {
        return 2*pi*radius;
    }
    public double area()
    {
        return pi*radius*radius;
    }
    public static void main(String[] args)
    {
        circle c=new circle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of radius:");
        c.radius=sc.nextInt();
        double circum=c.circumference();
        double area=c.area();
        System.out.println("Circumference:"+circum);
        System.out.println("Area:"+area);
    }
}
