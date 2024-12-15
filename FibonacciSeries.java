import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the limit for fibonacci series: ");
        int n = obj.nextInt();
        int f = 0, sec = 1, fib;
        System.out.println("Fibonacci series upto "+n+" terms is: ");
        System.out.print(f+" "+sec);
        for(int i = 2; i<n; i++){
            fib = f+sec;
            System.out.print(" "+fib);
            f = sec;
            sec = fib;
        }
        obj.close();
    }
}
