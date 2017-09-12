package javaProgram;

import java.util.Scanner;

public class Math {
int a,b,result;

Scanner sc=new Scanner(System.in);

    void get(){

        System.out.println("Enter value of A");
        a=sc.nextInt();
        System.out.println("Enter value of B");
        b=sc.nextInt();

              }

    void add(){
        result=a+b;
        System.out.println("Addition of A and B is="+result);
        System.out.println("Pro of A and B is="+result++);
        System.out.println("Pre of A and B is="+(++result));
    }

    void sub(){
        result=a-b;
        System.out.println("Subtraction of A and B is="+result);
        System.out.println("Pro of A and B is="+result++);
        System.out.println("Pre of A and B is="+(++result));
    }

    void mul(){
        result=a*b;
        System.out.println("Multiplication of A and B is="+result);
        System.out.println("Pro of A and B is="+result++);
        System.out.println("Pre of A and B is="+(++result));
    }

    void div(){
        result=a/b;
        System.out.println("Division of A and B is="+result);
        System.out.println("Pro of A and B is="+result++);
        System.out.println("Pre of A and B is="+(++result));
    }

    void mod(){
        result=a%b;
        System.out.println("Module of A and B is="+result);
        System.out.println("Pro of A and B is="+result++);
        System.out.println("Pre of A and B is="+(++result));
    }

    public static void main(String args[]){

        Math math=new Math();
        math.get();
        math.add();
        math.sub();
        math.div();
        math.mul();
        math.mod();

    }
}
