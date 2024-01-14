// Obtener el botón por su atributo "id"
const boton = document.getElementById("btnValidar");

// Agregar un evento de clic al botón
boton.addEventListener("click", function() {
  const correo = prompt("Por favor, ingrese un correo electrónico:");

  // Expresión regular para validar un correo electrónico
  const patron = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

  if (patron.test(correo)) {
    alert(`${correo} es un correo electrónico válido.`);
  } else {
    alert(`${correo} no es un correo electrónico válido.`);
  }
});
document.addEventListener("DOMContentLoaded", function() {
    const botonRedirigir = document.getElementById("irhtml");
  
    botonRedirigir.addEventListener("click", function() {
      // Redirigir a otro HTML al hacer clic en el botón
      window.location.href = "practica2_regex.html";
    });
  });
  
  
