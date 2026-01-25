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
        int res = findMissingElement(arr);
        System.out.print(res);
        
    }

    public static int findMissingElement(int[] arr) 
    {
        int sum = 0;
         int totalSum=0;
        int missingNumber = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            totalSum = (arr.length+1)*(arr.length+2)/2;
            missingNumber = totalSum - sum;

        }
        return missingNumber;
       
    }
}
