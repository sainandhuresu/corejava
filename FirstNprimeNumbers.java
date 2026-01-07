import java.util.Scanner;
public class Main{
    
    
    
    public static void firstNprime(int n)
    {
        int count= 0;
     for(int i=n;count<n;i++)
     {
       if(checkPrime(i))
       {
           System.out.print(i+" ");
           count++;
       }
     }   
    }
    
    public static boolean checkPrime(int n)
    {
        if(n<=1){
            return false;
        }
    
    for(int i=2;i*i<=n;i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
    }
    
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  
    
    firstNprime(n);
}
}
