public class Main{
    public static void main(String []args){
        int arr[] = {0,1,-2,3,-4,5,-6,7,-8,9};
       int pos = 0;
       int neg = 0;
       int zero = 0;
       
       for(int i=0;i<arr.length;i++){
           if(arr[i] > 0)
           pos++;
           else if(arr[i] < 0)
           neg++;
           else
           zero++;
       }
       System.out.println("Positives = "+pos);
       System.out.println("Negatives = "+neg);
       System.out.println("Zeros = "+zero);
      
           
    }
}
