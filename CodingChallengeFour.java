package CodingChallenges;

public class CodingChallengeFour {

    public static void main(String[] args) {
        
        System.out.println(getVoteCount(13, 0));
        System.out.println(getVoteCount(2,  33));
        System.out.println(getVoteCount(132, 132));
    }

    
    static int getVoteCount(int upvotes, int downvotes) throws IllegalArgumentException {

        if(upvotes<0||downvotes<0){
            throw new IllegalArgumentException(
                "Must use positive integers");
        } else {
            return upvotes-downvotes;
        }


    } 
}

