import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int [N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println(countLargestElement(arr));
        
    }
    public static int countLargestElement(int arr[])
    {
        int count = 0;
        int largest = arr[arr.length-1];
        for(int i=arr.length-1; i>=0; i--)
        {
            if(arr[i]==largest)
            {
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
