function parImpar() {
    let num1 = parseInt(prompt('Introduce el número'));
    if(num1%2 == 0) {
        alert(num1 + " es par");
        }
    else {
        alert(num1 + " es impar");
    }
}
parImpar();

function cadenaTexto() {
    let texto = prompt('Introduce el texto')
    if (texto == texto.toUpperCase()) {
        alert ("Está en mayúsculas")
    }
    if (texto == texto.toLowerCase()) {
        alert ("Está en minúsculas")
    }
    else {
        alert("Tiene una mezcla de ambas")
    }
}
cadenaTexto();