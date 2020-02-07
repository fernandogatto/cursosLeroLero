$(document).ready(function() {
    $('#form-registro').validate({
        rules: {
            nome: { required: true, minlength: 3, maxlength: 50 },
            cpf: { required: true, minlength: 14 },
            celular: { required: true, minlength: 15 },
            email: { required: true, maxlength: 50 },
            senha: { required: true, minlength: 3, maxlength: 255 }
        }, messages: {
            nome: { required: 'Nome obrigatório.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 50 dígitos.' },
            cpf: { required: 'CPF é obrigatório.', minlength: 'Mínimo de 14 dígitos.' },
            celular: { required: 'Celular é obrigatório.', minlength: 'Mínimo de 15 dígitos.' },
            email: { required: 'Email é obrigatório.', maxlength: 'Máximo de 50 dígitos.' },
            senha: { required: 'Senha é obrigatória.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 255 dígitos.' },
        },
        submitHandler: function(form) {
          form.submit();
        }
    });
});