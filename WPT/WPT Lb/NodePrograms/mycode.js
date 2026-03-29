
const myName="Sagar";
// console.log(myName);
// module.exports = myName;

const oddNum = (num)=> {

    if(num %2 != 0)
    {
        return `${num} is odd ` 
    }
    else{
        return `${num} is even ` 
    }
}
module.exports = {myName,oddNum};