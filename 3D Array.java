import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number schools:");
        int school = sc.nextInt();
        System.out.println("enter the number of classes:");
        int classes = sc.nextInt();
        System.out.println("enter the number of students:");
        int students = sc.nextInt();
        
        int arr[][][] = new int[school][classes][students];
        
        for(int i=0;i<school;i++)
        {
            for(int j=0;j<classes;j++)
            {
                for(int k=0;k<students;k++)
                {
                    System.out.println("enter the ages of "+(i+1)+ " school "+(j+1)+" class "+(k+1)+" student:");
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println("enter the ages of the students are:");
        for(int i=0;i<school;i++)
        {
            for(int j=0;j<classes;j++)
            {
                for(int k=0;k<students;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
