package aggregation;
class college
{
    String collegeName;
    int numOfDept;

    public college(String collegeName, int numOfDept) {
        this.collegeName = collegeName;
        this.numOfDept = numOfDept;
    }
}
class dept
{
    String deptName;
    int deptId;

    public dept(String deptName, int deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }
}
class emp
{
    int empId;
    String empName;
    String dept;

    public emp(int empId, String empName, String dept) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
public class aggregation_demo {
    public static void main(String args[])
    {
        emp emp1 = new emp(1,"richa","sales");
        System.out.println(emp1);
    }
}
