import fs from 'fs';
//the file path to write to. If file path doesnt exist it create that file and writes data 
//readFileSync(filePath,data,options)
const writefile = fs.writeFileSync("filename.txt", "This is a new File where I am writing in that using node module fs","utf-8");
console.log(writefile);

