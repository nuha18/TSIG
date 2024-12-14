import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = obj.nextInt();
        int a [] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            a[i] = obj.nextInt();
        }
        int min = a[0], max = a[0];
        for(int i = 0; i < n; i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("The minimum element of the array is " +min);
        System.out.println("The maximum element of the array is " +max);
        obj.close();
    }
}
