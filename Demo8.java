/*
    WAP to accept 3 no. from user and display the largest no. between them using nexted if else.
*/

import java.util.*;
class Demo8{
    public static void main(String arg[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>=b){
            if(a>=c){
                System.out.println("a is larger:"+a);
            }
            else{
                System.out.println("c is larger:"+c);
            }
        }
        else{
            if(b>=c){
                System.out.println("b is a larger:"+b);
            }
            else{
                System.out.println("c is larger:");
            }
        }
        sc.close();
    }
}