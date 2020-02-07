$(document).ready(function () {
  /*nova turma*/
  $(function () {
    $("form[name='novaturma']").validate({
      rules: {
        instrutor: {required: true, minlength: 3},
        curso: {required: true, minlength: 3},
        data_inicio: {required: true, minDateIni: true},
        data_fim: {required: true, minDateFim: true},
      },
      messages: {
        instrutor: {
          required: "Por favor, digite o nome do instrutor.",
          minlength: "O nome deve ter pelo menos três caracteres."
        },
        curso: {
          required: "Por favor, digite o nome do curso.",
          minlength: "o curso deve ter pelo menos cinco caracteres."
        },
        data_inicio: {
          required: "Por favor, digite a data de início do curso.",
          minDate: "A data de início deve depois de hoje."
        },
        data_fim: {
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
