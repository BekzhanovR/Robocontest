const fs = require('fs');
const data = fs.readFileSync(0, 'utf-8');

const [a, b] = data.split(' ').map(x => parseInt(x));
process.stdout.write( '' + (a+b) );