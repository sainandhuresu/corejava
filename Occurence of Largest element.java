import java.util.Scanner;
public class Main {

     public static int OccurenceOfLargestElement(int arr[])
     {
        int max = arr[0];
        int count = 0;

        for(int num : arr)
         {
            if(num > max)
             max = num;
         }
        for(int num : arr)
        {
            if(num==max)
            count++;
        }
        return count;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // implement your logic here
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int res = OccurenceOfLargestElement(arr);
        System.out.println(res);
    }
}
