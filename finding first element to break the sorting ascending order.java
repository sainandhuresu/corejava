import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }

        firstElementNotInSorting(arr);
        
    }
    public static void firstElementNotInSorting(int arr[])
    {
        boolean found = false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                System.out.print(arr[i+1]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print(-1);
        }
    }
}
