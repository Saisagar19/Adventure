import chalk from 'chalk';

const log = console.log;

log(chalk.blue('Hello') + ' World' + chalk.red('!'));
log(chalk.blue.bgYellow.bold('Sagar'));

let danger = chalk.bgRed.white;
let success = chalk.bgGreen.white.bold;

console.log(danger("Something went wrong"));
console.log(success("You done it"));