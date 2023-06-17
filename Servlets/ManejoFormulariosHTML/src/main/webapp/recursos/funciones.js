function validarForma(forma) {
    var usuario = forma.usuario;
    
    if (usuario.value == "" || usuario.value == "Escribir usuario") {
        alert("Debe proporcionar el nombre del usaurio");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    
    if (password.value == "" || password.value.length < 3) {
        alert("debe porporcional un password mayor a 3 caracteres");
        password.focus();
        password.selet();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    
    if (!checkSeleccionado) {
        alert("Debe seleccionar una teconologia");
        return false;
    }
    
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    for (var i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    
    if (!radioSeleccionado) {
        alert("debe seleccionar un genero");
        return false;
    }
    
    var ocupacion = forma,ocupacion;
    if (ocupacion.value == "") {
        alert("debe seleccionar una ocupacion");
        return false;
    }
    
    // formulario valido
    alert("formulario valido enviando datos al servidor");
    return true;
}