function NotNumberException(){}

function addition(num) {

    try {
        num + 1;
        if(isNaN(num)){
            throw new NotNumberException();
        } else {
            return num + 1;
        }
    } catch (e) {
        if (e instanceof NotNumberException){
            console.log("Error: Input must be a number");
        }
    }
    
}

console.log(addition(0));
console.log(addition(9));
console.log(addition(-3));
console.log(addition('a'));

