package CodingChallenges;

public class CodingChallengeSix {

    public static void main(String[] args) {

        String str = "CAT";
        String perms = " ";

        System.out.println(str);

        //System.out.println(swap(str, 0, 1));

        permute(str, perms);


        
    }



    public static String swap(String a, int i, int j){

        char temp;
        char[] arr = a.toCharArray();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

    static void permute(String s, String answer){
        if (s.length() == 0){
            System.out.print(answer + " ");
            return;
        }

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }


    
}
