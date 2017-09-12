package javaProgram;

import java.util.Scanner;

public class CheckGrade {
    int a;
    Scanner scanner=new Scanner(System.in);
    void get(){
        System.out.println("enter Percent");
        a= scanner.nextInt();

        if(a>=0 && a<35){
            System.out.println("Fail");
        }
        else if(a>=35 && a<60){
            System.out.println("Pass");
        }
        else if(a>=60 && a<75){
            System.out.println("First Class");
        }
        else if(a>=75 && a<=100){
            System.out.println("Distinction");
        }
        else {
            System.out.println("Not In Condition");
        }
    }
    public static void main(String[] args) {
            CheckGrade cd=new CheckGrade();
            cd.get();
    }


}
