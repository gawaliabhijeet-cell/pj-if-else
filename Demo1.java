/*
    WAP to check whether given no is even or odd number using if else.
*/ 

import java.util.*;
 class Demo1 {
    public static void main(String arg[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.:");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
    
}
