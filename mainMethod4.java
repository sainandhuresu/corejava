class calculator {
    
   int c;
    int add(int a, int b) 
    {
       c = a + b;
       return c;
    }
}
public class Main {
public static void main(String args[]){

  calculator c = new calculator();
  int num1 = 50;
  int num2 = 40;
  int res =  c.add(num1,num2);
  
  System.out.println(res);
 
 }
}
