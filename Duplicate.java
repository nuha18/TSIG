import java.util.*;

public class Duplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        int a[] = new int[5];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<(a.length - 1); i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    System.out.println("The duplicate numbers are: " +a[i]);
                }
            }
        }
    }
}