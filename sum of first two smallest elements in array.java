import java.util.Scanner;

public class Main {

    public static int minPairSum(int[] arr) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < firstSmallest)
            {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }
            else if(arr[i] < secondSmallest && arr[i]!=firstSmallest)
            {
                secondSmallest = arr[i];
            }
        }
        return firstSmallest + secondSmallest;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int res = minPairSum(arr);
        System.out.println(res);
        
    }
}
