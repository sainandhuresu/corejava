public class Main{
    public static void main(String []args){
        int arr[] = {12,54,75,36,51,47,18,21,65,27,33,44,56};
        int even = 0;
        int odd = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }   
        System.out.println("Even = "+even);
                System.out.println("Odd = "+odd);
    }
}
