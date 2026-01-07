import java.util.Scanner;
public class Main{
    
    
    
    public static void primeBetweenNM(int n, int m)
    {
     for(int i=n;i<=m;i++)
     {
       if(checkPrime(i))
       {
           System.out.print(i+" ");
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
    int m = sc.nextInt();
    
    primeBetweenNM(n,m);
}
}
