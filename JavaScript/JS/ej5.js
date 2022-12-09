var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

var dni, letra, letra_calculada;

function letraDni() {
    dni = parseInt(prompt('Introduce el número del DNI'));
    letra = prompt('Introduce la letra').toUpperCase();

    if ((dni >= 0) && (dni <= 99999999)) {
        letra_calculada = letras[dni % 23];
        if (letra == letra_calculada) {
            alert('El DNI del usuario es ' + dni + ' con letra ' + letra_calculada);
        } else {
            alert('La letra ' + letra + ' no coincide con la calculada → ' + letra_calculada);
        }
    } else {
        alert('No es correcto el valor introducido');
    }
}
letraDni();