import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of classes:");
        int classes = sc.nextInt();
        System.out.println("enter the number of students:");
        int students = sc.nextInt();
        
        int arr[][] = new int[classes][students];
        
        for(int i=0;i<classes;i++)
        {
           for(int j=0;j<students;j++)
           {
               System.out.println("enter the "+(i+1)+ " class "+(j+1)+" student ");
               arr[i][j]=sc.nextInt();
           }
        }
        System.out.println("the number of the students are in those classe are:");
        
        for(int i=0;i<classes;i++)
        {
            for(int j=0;j<students;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
