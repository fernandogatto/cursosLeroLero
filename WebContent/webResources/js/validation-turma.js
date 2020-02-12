$(document).ready(function () {
  /*nova turma*/
  $(function () {
    $("form[name='novaturma']").validate({
      rules: {
        instrutores_id: {required: true},
        cursos_id: {required: true},
        data_inicio: {required: true, minDateIni: true},
        data_final: {required: true, minDateFim: true},
      },
      messages: {
        instrutores_id: {
          required: "Por favor, digite o nome do instrutor.",
        },
        cursos_id: {
          required: "Por favor, digite o nome do curso.",
        },
        data_inicio: {
          required: "Por favor, digite a data de início do curso.",
          minDate: "A data de início deve depois de hoje."
        },
        data_final: {
          required: "Por favor, digite a data de fim do curso.",
          minDate: "A data de fim deve depois da data de início."
        },
        
      },
      submitHandler: function (form) {
        form.submit();
      }
    });
   
  });

  $.validator.addMethod("minDateIni", function(value, element) {
    let d = new Date()
    var month = d.getMonth()+1
    var day = d.getDate()
    var year = d.getFullYear()
    var dataAtual = year + '-' + (month<10? '0' : '') + month + '-' + (day<10? '0' : '') + day
    var data = $(".novaturma .data input").serializeArray()
    var dataInicio = data[0].value
    if(dataInicio > dataAtual){
      return true;
    }
    return false; 
  }, "Data de início deve ser depois de hoje.");

  $.validator.addMethod("minDateFim", function(value, element) {
    let d = new Date()
    var month = d.getMonth()+1
    var day = d.getDate()
    var year = d.getFullYear()
    var dataAtual = year + '-' + (month<10? '0' : '') + month + '-' + (day<10? '0' : '') + day
    var data = $(".novaturma .data input").serializeArray()
    var dataInicio = data[0].value
    var dataFim = data[1].value
    if(dataFim > dataAtual && dataFim > dataInicio){
      return true;
    }
    return false; 
  }, "Data de fim deve depois de hoje e depois da data de início.");
});
