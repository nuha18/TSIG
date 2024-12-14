import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.err.println("Enter number: ");
        int a = obj.nextInt();
        int t = 0;
        while(a != 0){
            t += a%10;
            a = a/10;
        }
        System.out.println("Sum of digits is:"+t);
        obj.close();
    }
}
