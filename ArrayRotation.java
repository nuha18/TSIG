import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = obj.nextInt();
            int [] a = new int[n];
            System.out.print("Enter the elements of the array: ");
            for(int i = 0; i<n; i++){
                a[i] = obj.nextInt();
            }
            System.out.print("Enter the value for k: ");
            int k = obj.nextInt();
            int [] b = new int[n];
            for(int i = (n-k); i<n; i++){
                for(int j = 0; j<k; j++){
                    b[j] = a[i];
                }
            }
            for(int i = 0; i<(n-k); i++){
                for(int j = k; j<n; j++){
                    b[j] = a[i];
                }
            }
            System.out.println("The array rotated by "+k+" positions is: ");
            for(int i = 0; i<n; i++){
                System.out.print(" "+b[i]);
            }
        }
    }
}
