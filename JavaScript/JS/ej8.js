let links = document.links.length;
alert("Número de enlaces de la página: " + links);

let link2 = document.getElementsByClassName("img-bear");
let mensaje = "Dirección a la que enlaza el último enlace: "+link2[link2.length-2].href;
alert(mensaje);

let parrafos = document.getElementsByTagName("p").length;
let mensaje2 = "Numero de párrafos: " + parrafos;
alert(mensaje2);

function parrafo() {
 
    let p = document.createElement("p");
    let pTexto = document.createTextNode("Aqui el nuevo párrafo creado con Javascript");
    p.appendChild(pTexto);
 
    document.body.appendChild(p);
}
window.onload = parrafo;