import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        countingpairs(arr);
       
    }
    public static void countingpairs(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                 count++;
            }
        }
        System.out.println(count);
    }
}
