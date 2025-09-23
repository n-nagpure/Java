/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author User
 */
class Employee {
    int e_no;
    double e_sal;
    String e_name;
    Employee(){
        e_no=101;
        e_sal=2090.50;
        e_name="AAAA";        
    }
    Employee(int empno, double empsal, String empname){
        e_no=empno;
        e_sal=empsal;
        e_name=empname;
    }
    void show(){
        System.out.println("Enter employee id - "+e_no);
        System.out.println("Enter employee salary - "+e_sal);
        System.out.println("Enter employee name - "+e_name);
    }
}
    public class EmployeeRecord{
       public static void main(String[] args){
            Employee e1=new Employee();
            e1.show();
            Employee e2=new Employee(102, 50050, "BBBB");
            e2.show();
        }
    }
