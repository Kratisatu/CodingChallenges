package CodingChallenges;

import java.util.*;

public class CodingChallengeFifteen {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String[] arr1 = new String[sc.nextInt()];        

        for(int i = 0;i < arr1.length;i++){

            arr1[i] = sc.next();

        }

        String[] arr2 = new String[sc.nextInt()];

        for(int j = 0; j < arr2.length;j++){

            arr2[j] = sc.next();
        }

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: "+ Arrays.toString(arr2));

        List<String> arr3 = new ArrayList<String>();
    
        for(int i = 0; i < arr1.length;i++){
            
            for(int j = 0; j < arr2.length;j++){
                
                if(arr1[i].equals(arr2[j])){
                    
                    arr3.add(arr1[i]);  

                }
            }
          
        }

        System.out.println("Common elements: " + arr3);

    }    
}
