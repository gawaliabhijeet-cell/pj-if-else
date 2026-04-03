/*
    WAP to accept 3 no. from used and display the largest no. between them using if else ladder.
*/

import java.util.*;
class Demo5{
    public static void main(String arg[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is greater");
        }
        else if(b>=a && b>=c){
            System.out.println("b is greater.");
        }
        else{
            System.out.println("c is greater");
        }
        sc.close();
    }
}