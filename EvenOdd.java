package javaProgram;

import java.util.Scanner;

public class EvenOdd{
    int a;
Scanner sc=new Scanner(System.in);

    void get(){
     System.out.println("enter No");
    a=sc.nextInt();
    }

    void check(){

     if(a%2==0){
         System.out.println("no is even");
     }
     else {
         System.out.println("no is odd");
     }
    }

    public static void main(String[] args) {
        EvenOdd evn=new EvenOdd();
        evn.get();
        evn.check();
    }

}
