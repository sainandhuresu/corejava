import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int k = scanner.nextInt();
        pairsWithSumK(arr,k);
       
    }
    public static void pairsWithSumK(int arr[],int k)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] + arr[j] == k)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
