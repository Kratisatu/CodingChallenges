function NotPosNumException(){}

function calcAge(num) {

    try {
        num*365
        if(num<0){
            throw new NotPosNumException();
        } else {
            return num*365;
        }
    } catch (e) {
        if (e instanceof NotPosNumException){
            console.log("Error: Input must be a positive integer");
        }
    }
    
}

console.log(calcAge(65));
console.log(calcAge(0));
console.log(calcAge(20));
