package CodingChallenges;

public class CodingChallengeTen {

    public static void main(String[] args) {
        swap(10,20);
        swap(20, 40);
    }

    public static void swap(int num1, int num2){

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        
        num1 = num1*num2;
        num2 = num1/num2;
        num1 = num1/num2;

        
        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
    
}
