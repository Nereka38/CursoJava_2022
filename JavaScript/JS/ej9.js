document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("form").addEventListener('submit', validarFormulario);
});

function validarFormulario(evento) {
    evento.preventDefault();
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

    let select = document.getElementById('impuestos');
    if (select.selectedIndex == 0) {
        alert("Debe seleccionar un impuesto")
    }
    if (select.selectedIndex == 1 || select.selectedIndex == 2) {
        alert("Debe seleccionar un impuesto mayor de 16%")
    }

    let descuento = document.getElementById('descuento').value;
    if (descuento == descuento) {
        alert("Esta opción es la más indicada")
    }
    this.submit();
}