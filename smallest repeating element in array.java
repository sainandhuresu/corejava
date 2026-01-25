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
        
        System.out.print(SmallestRepeat(arr));
        
    }
    public static int SmallestRepeat(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
                if(arr[i]==arr[i+1])
                {
                    return arr[i];
                }      
        }
        return -1;
    }
}
