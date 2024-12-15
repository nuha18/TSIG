import java.util.*;

public class Floor{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = obj.nextInt();
        int [] a = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            a[i] = obj.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Enter the element whose floor is to be found: ");
        int k = obj.nextInt();
        int high = n-1;
        int low = 0;
        int findex = -1;
        for(;low <= high;){
            int mid = (low+high)/2;
            if(a[mid] <= k){
                findex = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(findex != -1){
            System.out.println("The index of floor of k i.e. "+k+" is: "+findex);
        }
        else{
            System.out.println("-1");
        }
        obj.close();
    }
}
