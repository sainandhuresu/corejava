import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
         System.out.println("Enter the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        
        sortingArray(arr);
    }
    public static void sortingArray(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int num : arr){
        System.out.print(num+" ");
        }
    }
}
