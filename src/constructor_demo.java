import java.util.Date;
import java.util.Scanner;

public class constructor_demo {
   int d;
   int m;
   int y;
    public constructor_demo()
    {
        System.out.println("default");
        d=02;
        m=05;
        y=2023;
        System.out.println("current date: "+d+" current month:"+m+" current year:"+y);
    }
    public constructor_demo(int date,int month)
    {
        this.d=date;
        this.m=month;
        System.out.println("date:"+d+" month:"+m);

    }
    public constructor_demo(int d,int m, int y)
    {
        this.d=d;
        this.m=m;
        this.y=y;
        System.out.println("date: "+d+" month:"+m+" year:"+y);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int date=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        constructor_demo cd1=new constructor_demo();
        constructor_demo cd2=new constructor_demo(date,month);
        constructor_demo cd3=new constructor_demo(date,month,year);
    }
}
