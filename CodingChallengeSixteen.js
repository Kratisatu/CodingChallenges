function NotPosNumException(){}


function possibleBonus(num1, num2){
    
    try {
        if(num1<0||num2<0){
            throw new NotPosNumException
        } else {
            if(num2-num1>0&&num2-num1<=6){
                return true;
    }       else {return false;}
        }
        
    } catch (e) {

        if(e instanceof NotPosNumException){
            console.log("Error: Input must be a positive integer");
        }
        
    }
    
    
}

console.log(possibleBonus(3,7));
console.log(possibleBonus(1,9));
console.log(possibleBonus(5,3));
console.log(possibleBonus(-4,-1));

