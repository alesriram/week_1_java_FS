public class Lecture7 {
    int salary;
    int emp_id;
    String dept;
    Lecture7(int sal,int id,String d){
        salary=sal;
        emp_id=id;
        dept=d;
    }
    public static void main(String[] args) {
        Lecture7 hana=new Lecture7(20000,1211,"accounts");
        Lecture7 david=new Lecture7(50000, 12123, "HR");
        System.out.println("Emp_id "+hana.emp_id+" Salary "+hana.salary+" department "+hana.dept);
        System.out.println("Emp_id "+david.emp_id+" Salary "+david.salary+" department "+david.dept);
    }
}
