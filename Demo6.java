/*
    WAP to smallest no. using if else ladder
*/

import java.util.*;
class Demo6{
    public static void main(String arg[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<=b && a<=c){
            System.out.println("a is a smaller.");
        }
        else if(b<=c && b<=a){
            System.out.println("b is smaller");
        }
        else{
            System.out.println("c is smaller");
        }
        sc.close();
    }
}