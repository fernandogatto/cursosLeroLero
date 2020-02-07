$(document).ready(function() {
    $('#form-aluno').validate({
        rules: {
            cpf: { required: true, minlength: 14 },
            nome: { required: true, minlength: 3, maxlength: 50 },
            email: { required: true, maxlength: 50 },
            celular: { required: true, minlength: 15 },
            endereco: { required: true, minlength: 3, maxlength: 50 },
            cidade: { required: true, minlength: 3, maxlength: 30 },
            bairro: { required: true, minlength: 3, maxlength: 30 },
            cep: { required: true, minlength: 3, maxlength: 9 },
            login: { required: true, minlength: 3, maxlength: 20 },
            senha: { required: true, minlength: 3, maxlength: 255 }
        }, messages: {
            cpf: { required: 'CPF é obrigatório.', minlength: 'Mínimo de 14 dígitos.' },
            nome: { required: 'Nome obrigatório.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 50 dígitos.' },
            email: { required: 'Email é obrigatório.', maxlength: 'Máximo de 50 dígitos.' },
            celular: { required: 'Celular é obrigatório.', minlength: 'Mínimo de 15 dígitos.' },
            endereco: { required: 'Endereço é obrigatório.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 50 dígitos.' },
            cidade: { required: 'Cidade é obrigatória.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 30 dígitos.' },
            bairro: { required: 'Bairro é obrigatório.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 30 dígitos.' },
            cep: { required: 'CEP é obrigatório.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 9 dígitos.' },
            login: { required: 'Login é obrigatório.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 20 dígitos.' },
            senha: { required: 'Senha é obrigatória.', minlength: 'Mínimo de 3 dígitos.', maxlength: 'Máximo de 255 dígitos.' },
        },
        submitHandler: function(form) {
          form.submit();
        }
    });
});