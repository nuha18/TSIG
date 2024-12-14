import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = obj.nextInt();
        int [] a = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            a[i] = obj.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = obj.nextInt();

        int count = 0;
        for(int i = 0; i<n-1; i++){
            if(a[i] == target){
                count++;
            }
        }
        System.out.println("Target element "+target+" occured for "+count+" times");
        obj.close();
    }
}
