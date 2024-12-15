import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number between 1-1000: ");
        int element = obj.nextInt();
        int temp = element;
        if(element>1 && element<1001){
            int rem, arm = 0;
            while(temp != 0){
                rem = temp%10;
                arm += rem*rem*rem;
                temp /= 10;
            }
            if(element == arm){
                System.out.println(element+" is an armstrong number");
            }
            else{
                System.out.println(element+" is not an armstrong number");
            }
        }
        else{
            System.out.println("The number is out of range");
        }
        obj.close();
    }
}
