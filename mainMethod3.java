class calculator {
    
   int c;
    void add(int a, int b) 
    {
       c = a + b;
       System.out.println(c);
    }
}
public class Main {
public static void main(String args[]){

  calculator c = new calculator();
  int num1 = 50;
  int num2 = 40;
   c.add(num1,num2);
 
 }
}
