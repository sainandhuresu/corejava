import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        pairsSumAsPrime(arr);
        
    }
    public static boolean checkprime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void pairsSumAsPrime(int arr[])
    {
      int sum = 0;
      
        for(int i=0;i<arr.length-1;i++)
        {
            int prime=0;
            for(int j=i+1;j<arr.length;j++)
            {
                
                sum = arr[i] + arr[j];
                if( checkprime(sum))
                    System.out.println(arr[i]+" "+arr[j]);
                
            }
        }
       
    }
}
