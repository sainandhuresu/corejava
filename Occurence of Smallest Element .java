import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res = OccurenceOfSMallestElement(arr);
        System.out.println(res);
        
    }
    public static int OccurenceOfSMallestElement(int arr[])
    {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int num : arr)
        {
            if( num < min)
            min = num;
        }
        for(int num : arr)
        {
            if(num == min)
            count++;
        }
        return count++;
    }
}
