$(document).ready(function() {
    $('#form-matricula').validate({
        rules: {
            id_turma: { required: true },
            id_aluno: { required: true },
            data_matricula: { required: true, maxDate: true },
            nota_matricula: { required: true }
        }, messages: {
            id_turma: { required: 'ID da turma é obrigatório.' },
            id_aluno: { required: 'ID do aluno é obrigatório.' },
            data_matricula: { required: 'Data da matrícula é obrigatória.', maxDate: 'Data ultrapassa o valor limite.' },
            nota_matricula: { required: 'Nota é obrigatória.' },
        },
        submitHandler: function(form) {
          form.submit();
        }
    });

    $.validator.addMethod("maxDate", function(value, element) {
        var curDate = new Date();
        var inputDate = new Date(value);
        if (inputDate < curDate)
            return true;
        return false;
    }, "Data inváldia.");
});