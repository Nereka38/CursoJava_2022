document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("form").addEventListener('submit', validarFormulario);
});

document.getElementById("descuento").addEventListener('click',function(){
    alert('Esta es la mejor opción');
})

function validarFormulario(evento) {
    evento.preventDefault();

    let selectProvincias = document.getElementById('provincias');
    if (selectProvincias.selectedIndex == 0) {
        alert("Debe seleccionar una provincia")
    }

    let dia = document.getElementById('dia').value;
    let mes = document.getElementById('mes');
    let año = document.getElementById('año').value;
    if (dia == "" || dia == 0 || dia >= 31 || isNaN(dia)) {
        alert("Añade un día correcto")
    }

    if (mes.selectedIndex == 0) {
        alert("Selecciona un mes")
    }

    if (año == "" || año == 0 || año <= 1900 || isNaN(año)) {
        alert("Añade un año correcto")
    }

    let name = document.getElementById('name').value;
    if (name.length == 0) {
        alert('No has escrito nada en el nombre');
        return;
    }

    let precio = document.getElementById('precio').value;
    if (precio == "") {
        alert("Debe ingresar un precio");
        return;
    }
    if (precio < 120) {
        alert("Tiene que ser mayor de 120");
        return;
    }

    let selectImpuesto = document.getElementById('impuestos');
    if (selectImpuesto.selectedIndex == 0) {
        alert("Debe seleccionar un impuesto")
    }
    if (select.selectedIndex == 1 || select.selectedIndex == 2) {
        alert("Debe seleccionar un impuesto mayor de 16%")
    }
    this.submit();
}