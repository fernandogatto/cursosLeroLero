$(document).ready(function() {
    $('#form-novo-admin').validate({
        rules: {
            nome: { required: true, minlength: 3, maxlength: 50 },
            login: { required: true, minlength: 3, maxlength: 20 },
            senha: { required: true, minlength: 3, maxlength: 255 }
        }, messages: {
            nome: { required: 'Nome obrigatório.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 50 dígitos.' },
            login: { required: 'Login é obrigatório.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 20 dígitos.' },
            senha: { required: 'Senha é obrigatória.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 255 dígitos.' },
        },
        submitHandler: function(form) {
          form.submit();
        }
    });
});