import java.util.Scanner;
public class Main{
public static void main(String []args){
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i] = sc.nextInt();
    }
    int res = IndexOfLargestElement(arr);
    System.out.println(res);
 
  }

  public static int IndexOfLargestElement(int arr[])
  {
    int LargestValue = Integer.MIN_VALUE;
    int LargestIndex = 0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i] > LargestValue)
        {
            LargestValue = arr[i];
            LargestIndex = i;
        }
    }
     return LargestIndex;
  }
} 

