package CodingChallenges;

import java.util.*;

public class CodingChallengeOne {

    static int convertMinToSecs(int minutes){    
        
        return minutes*60;

    }

    public static void main(String[] args){

        System.out.println(convertMinToSecs(2));
        System.out.println(convertMinToSecs(1));
        System.out.println(convertMinToSecs(5));
        System.out.println(convertMinToSecs(60));


    }
    
}
