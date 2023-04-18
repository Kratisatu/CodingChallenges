package CodingChallenges;


import java.util.*;

public class CodingChallengeEight {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "def";
        String str3 = "adbecf";
        String str4 = "abcdef";
        String str5 = "defabc";
        String str6 = "bacdef";
        String str7 = "edfabc";
        String str8 = "abdcef";


        //isValidShuffle(str1, str2, str3);

        System.out.println(isValidShuffle(str1,str2,str7));

        //Valid shuffles == "adbecf" or "daebfc"
        
    }

    public static boolean isValidShuffle(String str1, String str2, String str3){        

        if(str3.equals(str1.concat(str2))||str3.equals(str2.concat(str1))){
            //System.out.println("This is not a shuffle");
            return false;
        } else if (str3.charAt(0)!=str1.charAt(0)&&str3.charAt(0)!=str2.charAt(0)){
            //System.out.println("This is not a shuffle, bad beginning");
            return false;
        }

        for(int i = 0;i < str3.length();i++){
            
            for(int j = i; j < str3.length();j++){

                if(str1.contains(String.valueOf(str3.charAt(i)))&&(str1.contains(String.valueOf(str3.charAt(j))))){
                    //System.out.println("Compare letters: " + str3.charAt(i) + " and " + str3.charAt(j));
                    if(str1.indexOf(str3.charAt(i))>str1.indexOf(str3.charAt(j))){
                        System.out.println("Not a valid shuffle");
                        return false;
                    }
                }

                if(str2.contains(String.valueOf(str3.charAt(i)))&&(str2.contains(String.valueOf(str3.charAt(j))))){
                    //System.out.println("Compare letters: " + str3.charAt(i)+ " and " + str3.charAt(j));
                    if(str2.indexOf(str3.charAt(i))>str2.indexOf(str3.charAt(j))){
                        System.out.println("Not a valid shuffle");
                        return false;
                    }
                }           
                
            }
        }       
        //System.out.println("Is a valid shuffle");
        return true;
    }
}