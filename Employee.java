import java.io.*;
import java.util.*;
class Employee
{
static  int empno;
static double salary,tsalary;
Employee(double salary)
{
empno++;
this.salary=salary;
tsalary=salary+tsalary;
}
void show()
{
System.out.println("Employee Number: " +empno);
System.out.println("Total Salary   : " +tsalary);
}
}
class Employeee
{
public static void main(String args[])
{
float sa1,sa2,sa3,sa4,sa5;
System.out.println("Enter First person salary");
Scanner sc=new Scanner(System.in);
sa1=sc.nextFloat();
Employee e1=new Employee(sa1);
e1.show();
System.out.println("Enter Second person salary");
sa2=sc.nextFloat();
Employee e2=new Employee(sa2);
e2.show();
System.out.println("Enter Third person salary");
sa3=sc.nextFloat();
Employee e3=new Employee(sa3);
e3.show();
System.out.println("Enter Fourth person salary");
sa4=sc.nextFloat();
Employee e4=new Employee(sa4);
e4.show();
System.out.println("Enter Fifth person salary");
sa5=sc.nextFloat();
Employee e5=new Employee(sa5);
e5.show();
}
}

