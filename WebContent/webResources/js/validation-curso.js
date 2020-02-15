$(document).ready(function () {
  /*novo curso*/
  $(function () {
    $("form[name='novocurso']").validate({
      rules: {
        nome: {required: true, minlength: 3, maxlength: 50},
        requisito: {maxlength: 255},
        ementa: {maxlength: 255},
      },
      messages: {
        nome_curso: {
          required: "Por favor, digite o nome do curso.",
          minlength: "O nome deve ter pelo menos três caracteres.",
          maxlength: "O nome deve ter no máximo 50 caracteres."
        },
        requisito: {
          maxlength: "O requisito deve ter no máximo 255 caracteres."
        },
        ementa: {
          maxlength: "A ementa deve ter no máximo 255 caracteres."
        },
      },
      submitHandler: function (form) {
        form.submit();
      }
    });
  });
});