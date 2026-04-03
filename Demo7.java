/*
    WAP to accept mark from user display the result as per given table
    using if-else ladder.
*/

import java.util.*;
class Demo7{
    public static void main(String arg[]){
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no:");
        m=sc.nextInt();
        if(m<=100 && m>=80){
            System.out.println("Destinction");
        }
        else if(m<80 && m>=60){
            System.out.println("First class.");
        }
        else if(m<60 && m>=40){
            System.out.println("second class");
        }
        else{
            System.out.println("fail");
        }
        sc.close();
    }
}