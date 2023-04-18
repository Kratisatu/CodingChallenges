package CodingChallenges;

import java.util.*;

public class CodingChallengeFourteen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];

        for(int i = 0; i < arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int altIndex = sc.nextInt();

        int altValue = sc.nextInt();

        arr[altIndex] = altValue;

        System.out.println("The array after alteration:");

        for(int j = 0; j < arr.length;j++){
            System.out.println(arr[j]);
        }
        
    }
    
}
