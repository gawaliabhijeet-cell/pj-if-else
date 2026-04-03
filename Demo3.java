/*
    WAP to check wether the given character is ovel or consonent. usting command line argument.
*/

class Demo3{
    public static void main(String arg[]){
        char ch;
        ch=arg[0].charAt(0); 
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("character is vowel: ");

        }
        else{
            System.out.println("character is constont:");
        }
    }
}