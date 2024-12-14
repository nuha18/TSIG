import java.util.*;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        int rem, odd=0, even=0;
        while(num != 0){
            rem = num%10;
            if(rem%2 == 0){
                even++;
            }
            else{
                odd++;
            }
            num = num/10;
        }
        System.out.println("The even counts are: " +even);
        System.out.println("The odd counts are: " +odd);
        obj.close();
    }
}
    

