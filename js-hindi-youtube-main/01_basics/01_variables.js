const accountId = 144553
let accountEmail = "saket@gmail.com"
var acccountPassword = "12345"
accountCity = "Jaipur"

let accountState;

accountEmail = "Devansh@gmail.com"
acccountPassword = "221212121"
accountCity = "Bengaluru"

//accountId = 2 // not allowed
console.log(accountId);

/*
Prefer not to use var
because of issues in block scope and functional scope
*/

console.table([accountId,accountEmail, acccountPassword, accountCity, accountState]);