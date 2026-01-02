package Preparation;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumBrute {

    public static int[] twoSum(int arr[], int target){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){

                if(arr[i] + arr[j] == target){
                return new int[] {i, j};
                }
            }
        }
        return new int [] {-1, -1};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Enter each element at index " + i);
             arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter target number");
        int target = sc.nextInt();

        int[] result = twoSum(arr, target);

        if(result[0] == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Indices "+ result[0] + " " + result[1]);
        }
    }
}
