import java.util.Scanner;
public class Main{
    
    public static void higestCommonFactor(int n1, int n2)
    {
        for(int i=((n1<n2)?n1:n2);i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
          int n2= sc.nextInt();
          
          higestCommonFactor(n1,n2);
    }
}
