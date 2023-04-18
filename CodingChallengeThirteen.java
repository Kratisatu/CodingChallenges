package CodingChallenges;

import java.util.*;

public class CodingChallengeThirteen{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int arrSize = sc.nextInt();

        int[] arr;

        arr = new int[arrSize];

        

        for(int i = 0;i<arrSize;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for(int j = 0; j < arrSize;j++){

            sum += arr[j];           
            
        }

        double avg = sum/arr.length;

        System.out.println("The average value of the array elements is : "+ avg);





    }

    
}
