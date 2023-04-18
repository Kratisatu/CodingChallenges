package CodingChallenges;



public class NewCodingChallenge {

    private static String revString;

    public static void main(String[] args) {       

        palindromeCheck("madami");
        palindromeCheck("madam");
        palindromeCheck("miami");
        palindromeCheck("racecar");
        
    }

    static String reverseString(String str){   

        //Create char array from input string
        char[] c = str.toCharArray();
        //Create empty char array equal to length of input string
        char[] d = new char[c.length];

        //Insert the string backwards into the empty char array
        for(int x = 0,y = c.length-1;x<c.length&&y>=0;x++,y--)
        {              
			d[y] = c[x];
		}

        //Turn new char array (reversed) into a new string
        revString = String.valueOf(d);
  
        return revString;                       

    }

    static void palindromeCheck(String str){

        // .equals method checks for string content equality, while == checks for memory location equality
        if(str.equals(reverseString(str))){
            System.out.println(str + " ---> " + "This is a palindrome");
        } else {
            System.out.println(str + " ---> " + "This is not a palindrome");
        }
    }
    
}
