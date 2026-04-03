/*
    WAP to check wether given character is vowel consonet using if else
*/

import java.util.*;
class Demo4 {
    public static void main(String arg[]){
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("character is vowel.");
        }
        else{
            System.out.println("character is consonant.");
        }
        sc.close();
    }
}