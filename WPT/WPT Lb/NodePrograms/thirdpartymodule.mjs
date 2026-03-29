import validator from 'validator';

let myName="";
console.log(validator.isEmpty(myName))
let my="sagar";
console.log(validator.isEmpty(my))
let email="sagar@gmail.com";
console.log(validator.isEmail(email))

let email2="sagargmail.com";
console.log(validator.isEmail(email2))



