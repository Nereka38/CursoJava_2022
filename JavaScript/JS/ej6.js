const dato = parseInt(prompt('Introduce el número'));
let r = 1;
for(let i = dato; i>0; i--){
    r *= i;
}
alert(r);