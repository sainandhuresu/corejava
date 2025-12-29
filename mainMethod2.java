class calculator {
    int a = 50;
    int b = 40;

    int add() {
        int c;
        c = a+b;
        return c;
        
    }
}
public class Main {
public static void main(String args[]){

  calculator c = new calculator();
  int res = c.add();
  System.out.println(res);
 }
}
