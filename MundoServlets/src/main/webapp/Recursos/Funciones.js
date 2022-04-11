function validarForma(forma) {
    var usuario = forma.usuario;
    if (usuario.value == "" || usuario.value == "Escribir usuario") {
        alert("Propocione su usuraio o se muere");
        usuario.focus();
        usuario.select();
        return false;
    }
    var password = forma.password;
    if (password.value == "" || password.value.length < 3) {
        alert("Faltan valores implementa o exploto");
        password.focus();
        password.select();
        return false;
    }
    var tegnologias = forma.tegnologia;
    var checkSeleccionado = false;

    for (var i = 0; i < tegnologias.length; i++) {
        if (tegnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    
    if(!checkSeleccionado){
        alert("Falta un valor Insertele o disparo");
        return false;
    }
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    for(var i = 0 ; i < generos.length; i ++){
        if(generos[i].checked){
            radioSeleccionado = true;
        }
    }
    
    if(!radioSeleccionado){
        alert("No eres un Hetero o eres uno de los 32 solo hay DOS generos XDxdXD");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Vos tu no Haced nada o que");
        return false;
    }
    
    //El formulario ya es valido 
    alert("che boludo ya esta enviado tus datos al servidor");
    return true;
}