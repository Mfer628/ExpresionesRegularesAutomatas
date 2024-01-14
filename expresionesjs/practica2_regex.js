function validarContraseña(contraseña) {
    // La contraseña debe tener al menos 8 caracteres
    // y contener al menos una letra minúscula, una letra mayúscula, un número y un carácter especial.
    const patron = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    return patron.test(contraseña);
  }
  
  document.addEventListener("DOMContentLoaded", function() {
    const botonValidar = document.getElementById("btnValidar");
    const inputContraseña = document.getElementById("inputContraseña");
    const resultado = document.getElementById("resultado");
  
    botonValidar.addEventListener("click", function() {
      const contraseña = inputContraseña.value;
      if (validarContraseña(contraseña)) {
        resultado.textContent = "La contraseña es válida.";
      } else {
        resultado.textContent = "La contraseña no es válida.";
      }
    });
  });
  