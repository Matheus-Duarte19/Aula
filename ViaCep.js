var request = require('request');
request('https://viacep.com.br/ws/11668-141/json/', function (error, response, body) {  
  var parsedCEP = JSON.parse(body);
  console.log(parsedCEP.localidade+" - "+parsedCEP.uf);
  console.log(parsedCEP.localidade);
});