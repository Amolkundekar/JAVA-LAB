
/*
 * 
 * Write a program to develop class employee with constructor to initialize instance
variables. Provide Set method and Get method for instance variables. Also provide a
method to raise Salary of each employee by 10%.
 */

import java.util.Scanner;

public class Employee {
    int empid;
    String emp_name;
    String designation;
    float salary;
    int age;

    Employee(int id, String name, String d,float s, int a) {
        empid = id;
        emp_name = name;
        designation=d;
        salary = s;
        age=a;
    }

    Employee() {

    }
    //setters
    void set_id(int id) {
        empid = id;
    }

    void set_name(String name) {
        emp_name = name;
    }

    void set_salary(float s) {
        salary = s;
    }

    void set_age(int a) {
        age = a;
    }

    void set_designation(String d) {
        designation = d;
    }


    //getters
    int get_id() {
        return empid;
    }

    String get_name() {
        return emp_name;
    }

    Float get_salary() {
        return salary;
    }
    int get_age(){
        return age;
    }
    String get_designation(){
        return designation;
    }

    float increment()
    {
        float incremented_salary;
        incremented_salary = salary+ (salary/100)*10;


        return incremented_salary;
    }

    public static void main(String[] args) {
          int empid;
        String emp_name;
        String designation;
        float salary;
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter id:");
        empid = sc.nextInt();
  
        System.out.println("enter name:");
        emp_name = sc.nextLine();



        System.out.println("enter Designation :");
        designation = sc.nextLine();
        System.out.println("enter salary :");
        salary = sc.nextFloat();
        System.out.println("enter age:");
        age = sc.nextInt();
        
        Employee a= new Employee(empid, emp_name, designation, salary,age);

        System.out.println("Name : "+a.get_name());
        System.out.println("id : "+a.get_id());
        System.out.println("Designation : "+a.get_designation());
        System.out.println("salary : "+a.get_salary());
        System.out.println("Name : "+a.get_age());
        System.out.println("salary after increment : "+ a.increment());
        sc.close();
    }

}
