import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ASCII number: ");
        int n = scanner.nextInt();
       char ch = (char) n;
       System.out.println("The equivalent ASCII charecter is: "+ch);
    }
}
