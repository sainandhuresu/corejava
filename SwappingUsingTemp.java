import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
    
       int temp = 0;
       
       System.out.println("before Swapping:");
       System.out.println(a);
       System.out.println(b);
       
       temp = b;
       b = a;
       a = temp;
       
       System.out.println("after Swapping:");
       System.out.println(a);
       System.out.println(b);
       
       }   
    }
