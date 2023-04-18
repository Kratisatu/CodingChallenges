package CodingChallenges;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingChallengeSeven {

    public static void main(String[] args) {

        String str = "Hello my name is Christian What is your name christian";

        List<String> wordsList = Arrays.asList(makeArray(str));

        System.out.println(Arrays.toString(makeArray(str)));

        Map<String,Integer> collect = wordsList.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));

     System.out.println(collect);
        
    }

    public static String[] makeArray(String input){

        String[] words = input.toLowerCase().split("\\s+");

        return words;

    }
    
}
