import java.util.*;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = obj.nextInt();
        int [] a = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            a[i] = obj.nextInt();
        }
        int temp = 0;
        for(int i = 0; i<n; i++){
            if(a[i]%2 == 0){
                temp += a[i];
            }
        }
        System.out.println("The sum of even numbers in the array is: "+temp);
        obj.close();
    }
}
