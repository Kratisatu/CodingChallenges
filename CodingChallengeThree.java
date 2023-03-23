package CodingChallenges;

public class CodingChallengeThree {

    public static void main(String[] args){

        System.out.println(compareNums(4,8));
        System.out.println(compareNums(2,2));
        System.out.println(compareNums(42,32));

    }

    public static boolean compareNums(int num1, int num2){
        if(num1==num2){
            return true;
        } else {
            return false;
        }
    }
    
}
