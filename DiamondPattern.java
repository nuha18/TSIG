import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = obj.nextInt();
        // Upper Half Cycle
        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Half Diamond
        for(int i = rows-1; i>=1; i--){
            for(int j = 1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        obj.close();
    }
}
