$(document).ready(function () {
  /*novo instrutor*/
  $(function () {
    $("form[name='novoinstrutor']").validate({
      rules: {
        nome: {required: true, minlength: 3, maxlength: 50},
        email: {required: true, minlength: 5, maxlength: 50},
        login: {required: true, minlength: 5, maxlength: 20},
        senha: {required: true, minlength: 5, maxlength: 255},
        experiencia: {required: true, minlength: 5, maxlength: 255}
      },
      messages: {
        nome: {
          required: "Por favor, digite o nome do instrutor.",
          minlength: "O nome deve ter pelo menos três caracteres.",
          maxlength: "O nome deve ter no máximo 50 caracteres."
        },
        email: {
          required: "Por favor, digite o email do instrutor.",
          minlength: "O email deve ter pelo menos cinco caracteres.",
          maxlength: "O email deve ter no máximo 50 caracteres."
        },
        login: {
          required: "Por favor, digite o seu nome para login.",
          minlength: "O login deve ter pelo menos cinco caracteres.",
          maxlength: "O login deve ter no máximo 20 caracteres."
        },
        senha: {
          required: "Por favor, digite a seu senha.",
          minlength: "A senha deve ter pelo menos cinco caracteres.",
          maxlength: "A senha deve ter no máximo 255 caracteres."
        },
        experiencia: {
	      required: "Por favor, digite sua experiência.",
	      minlegth: "A experiência deve ter pelo menos cinco caracteres.",
	      maxlength: "A experiência deve ter no máximo 255 caracteres."
        }
      },
      submitHandler: function (form) {
        form.submit();
      }
    });
  });
});