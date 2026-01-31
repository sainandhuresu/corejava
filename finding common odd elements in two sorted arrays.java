import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i] =  scanner.nextInt();
        }
        int m = scanner.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i] = scanner.nextInt();
        }
        commonRepeatOdd(arr1,arr2);
    }
    public static void commonRepeatOdd(int arr1[],int arr2[]){
        boolean found = false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2!=0){
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i] == arr2[j]){
                        System.out.print(arr1[i]+" " );
                        found = true;
                        break;
                    }
                }
            }
        }
        if(!found)
        System.out.print("No common odd elements found.");
    }
}
