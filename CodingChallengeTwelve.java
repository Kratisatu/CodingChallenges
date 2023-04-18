package CodingChallenges;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class CodingChallengeTwelve {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arrSize = sc.nextInt();

        int[] arr;

        arr = new int[arrSize];

        int i = 0;
        
        while (i < arrSize){

            arr[i] = sc.nextInt();
            i++;

        }

        sc.close();

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

       

        for(int j = 0; j < arr.length;j++){

            System.out.println(arr[j]);
        }     
        
        
        


    }

    static void bubbleSort(int arr[], int n){
        if(n==1){
            return;
        }

        for(int i = 0; i<n-1; i++){
            if(arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubbleSort(arr, n-1);
    }

    

}
