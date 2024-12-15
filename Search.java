import java.util.*;

public class Search{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = obj.nextInt();
        int [] a = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            a[i] = obj.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Enter the element to be searched: ");
        int element = obj.nextInt();
        int index = Bin.binary(a, element, 0, n - 1);
        if(index != -1){
            System.out.println("Element is present at index: " + index);
        }
        else {
            System.out.println("Element is not present in the array");
        }
        obj.close();
    }
}

class Bin{
    public static int binary(int a[], int element, int low, int high){
        if (low <= high) {
            int mid = (low + high) / 2;
            if (element == a[mid]){
                return mid;
            }
            else if (element > a[mid]){
                return binary(a, element, mid+1, high);
            }
            else if(element < a[mid]){
                return binary(a, element, low, mid-1);
            }
        }
        return -1;
    }
}

