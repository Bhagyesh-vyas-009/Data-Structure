import java.util.Scanner;

class Empdetail
{
    int empid;
    String name,designation;
    int salary;

    Empdetail(int empid,String name,String designation,int salary)
    {
        this.empid=empid;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }

    public void print()
    {
        System.out.println("Employee id = "+empid+
        "\nName = "+name+
        "\nDesignation = " +designation+
        "\nSalary = "+salary);
    }
}

public class Employee 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Employee details : ");
        System.out.println("Emp id,Name,Designation,Salary ");

        Empdetail e=new Empdetail(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());

        e.print();

    }
}
