package com.task3;

import java.util.Scanner;
interface Taxable
{
    float salestax=7f;
    float incometax= 10.5f;
    public abstract void calcTax();}
    class Employee implements Taxable
{
    int empId;
    String name;
    float salary;
    float tax;
    Employee(int a,String b,float c){
        this.empId=a;
        this.name=b;
        this.salary=c;}
        public void calcTax(){
        tax=(incometax*salary)/100;
        System.out.println(name+ " income tax  is :" +tax);



    }

}
 class Product implements Taxable {
     int pid;
     double price;
     int quantity;
     float tax;
     Product(int pid, double price, int quantity) {
         this.pid = pid;
         this.price = price;
         this.quantity = quantity;
     }

     public void calcTax() {
         tax = (float) ((salestax * price) / 100);
         System.out.println("sales tax for product no" + pid + "is: " + tax);

     }

static class Drivermain{
     public static void main(String[] args){
         Scanner Scanner=new Scanner(System.in);
         {System.out.println("enter employee ID,NAME,SALARY");

             int empId=Scanner.nextInt();
             String name=Scanner.next();
             float salary= Scanner.nextFloat();
             Taxable t=new Employee(empId,name,salary);
             t.calcTax();
             System.out.println("Please enter ID,Quantity, Price of the Product:");
             int pid=Scanner.nextInt();
             int price=Scanner.nextInt();
             int quantity=Scanner.nextInt();
             Taxable t1=new Product(pid,price,quantity);
             t1.calcTax();

         }




     }
    }}
