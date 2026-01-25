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
       printRepeatingElement(arr);
        
    }

   
            public static void printRepeatingElement(int arr[])
    {
        int lastPrinted = Integer.MIN_VALUE;
        boolean foundDuplicate = false;
        for(int i=0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1] && arr[i] != lastPrinted) {
                System.out.print(arr[i] + " ");
                lastPrinted = arr[i];
                foundDuplicate = true;
            }
        }
        if(!foundDuplicate) {
            System.out.print(-1);
        }
    }
        
    
}
