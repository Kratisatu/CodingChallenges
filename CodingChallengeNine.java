package CodingChallenges;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;
import java.util.*;

public class CodingChallengeNine {

    public static void main(String[] args) {
        
        String str  = "helllco";

        List<String> charsList = Arrays.asList(makeArray(str));
        System.out.println(charsList);

        Map<String,Integer> collect = charsList.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));

     System.out.println("Character Count Map: " + collect);
     System.out.println(collect.values());

   

    

     //Object[] valArray = collect.values().toArray();

     for(int i = 0; i < collect.size();i++){

        System.out.println(collect(Collectors.));

        
     }
     

    }

    public static String[] makeArray(String input){

        String[] myChars = input.toLowerCase().split("");

        System.out.println(Arrays.toString(myChars));

        return myChars;

    }
    
}
