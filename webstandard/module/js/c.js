import add2 from './a.js';
import{minus, multi, var3 as var5} from './b.js';
import * as myobj from './b.js';


let var1= 10;
let var2= 20;
console.log(var1);
const sum = add2(var1,myobj.var3);
console.log(sum);
console.log(minus(var1,var2));
console.log(multi(var2,var5));

