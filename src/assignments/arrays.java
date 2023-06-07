package assignments;

import java.util.Scanner;
class student
{
    int roll_no;
    String name;
    int marks;

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public student(int roll_no, String name, int marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
    public void show()
    {
        System.out.println("-----------------------------------------");
        System.out.println("student info for batch");
        System.out.println("roll no: "+roll_no+" name: "+name+" marks: "+marks);
        System.out.println("-----------------------------------------");
    }

}
public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of batches: ");
        int batches=sc.nextInt();
        student[] batch=new student[batches];
        for(int i=0;i<batches;i++)
        {
            System.out.println("enter student info for batch-"+(i+1));
            System.out.println("enter student roll no: ");
            int roll=sc.nextInt();
            System.out.println("enter student name: ");
            String name=sc.next();
            System.out.println("enter student marks: ");
            int marks=sc.nextInt();
            batch[i]=new student(roll,name,marks);

            batch[i].show();
        }
    }
}
