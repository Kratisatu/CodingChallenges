package CodingChallenges;
import java.util.*;

public class CodingChallengeTwo {

    public static void main(String[] args){

        System.out.println(Arrays.toString(arrayOfMultiples(7,5)));
        System.out.println(Arrays.toString(arrayOfMultiples(12,10)));
        System.out.println(Arrays.toString(arrayOfMultiples(17,6)));
        System.out.println(Arrays.toString(arrayOfMultiples(35, 8)));
    }

    public static int[] arrayOfMultiples(int num, int length){
        int[] arr = new int[length];

        arr[0] = num;

        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + num;
        }
        return arr;
    }
    
}
