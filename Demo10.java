/*
    WAP 3 no. from used and display the largest no. between them using conditional operator.
*/

import java.util.*;
class Demo10{
    public static void main(String arg[]){
        int a,b,c,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        l=(a>=b?(a>=c? a:c):(b>=c? b:c));
        System.out.println(" greater no. is:"+l);

        sc.close();
    }
}