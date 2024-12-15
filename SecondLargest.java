import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = obj.nextInt();
        int [] a = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            a[i] = obj.nextInt();
        }
        int max = a[0];
        for(int i = 0; i<n; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        int sMax = a[0];
        for(int i = 0; i<n; i++){
            if(a[i] > sMax && a[i] != max){
                sMax = a[i];
            }
        }

        if(sMax != max){
            System.out.println("The second largest element is: " +sMax);
        }
        else{
            System.out.println(-1);
        }
        obj.close();
    }
}
