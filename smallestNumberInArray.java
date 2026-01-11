import java.util.Scanner;
public class Main {
   public  static int  smallestNumber(int[] arr)
    {
    	int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		int res = smallestNumber(arr);
        System.out.println(res);
	}
    
}
