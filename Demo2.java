/*
    WAP accept 2 no. and display largest no. between them using if else.
*/

import java.util.*;
class Demo2{
    public static void main(String arg[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b no.:");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>=b){
            System.out.println("a is a greater.");
        }
        else{
            System.out.println("b is a greater.");
        }
        sc.close();
    }
}