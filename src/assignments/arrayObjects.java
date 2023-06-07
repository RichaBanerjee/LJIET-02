package assignments;
class emp
{
    String name;
    String dept;
    int salary;

    @Override
    public String toString() {
        return "emp{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public emp(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}
public class arrayObjects {
    public static void main(String[] args) {
        emp[] employees={
                new emp("abc","sales",1234),
                new emp("def","hr",5678),
                new emp("ghi","marketing",7412),
                new emp("jkl","sales",8523),
                new emp("mno","hr",4563)
        };
        for(int i=0;i<employees.length;i++)
        {
            System.out.println(employees[i]);
        }
        System.out.println("number of objects: "+employees.length);
    }
}
