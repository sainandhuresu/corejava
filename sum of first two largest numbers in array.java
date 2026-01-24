import java.util.Scanner;

public class Main {

    public static int maxPairSum(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > firstLargest)
            {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i]!=firstLargest)
            {
                secondLargest = arr[i];
            }
        }
        return firstLargest + secondLargest;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int res = maxPairSum(arr);
        System.out.println(res);
        
    }
}
