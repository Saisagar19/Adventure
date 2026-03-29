const os = require('os');

const path = require("path");


// console.log(os.arch())
// console.log(os.hostname())
// console.log(os.homedir())
// console.log(os.totalmem())
// console.log(os.freemem())
// console.log(os.cpus())

console.log("***********************************")

console.log(__dirname); // current directory path
console.log(__filename);   // current directory path with filename
console.log(path.extname(__filename));      //it returns extention name
console.log(path.isAbsolute(__filename)); // it returns in boolean wheater while is absolute or not
console.log(path.basename(__filename)); // it returns file name 
console.log(path.basename(__dirname));  // it return current folder name
console.log(path.join(__dirname,"/any/path")) // it joins file path with current path







