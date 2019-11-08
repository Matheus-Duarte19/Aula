const TelegramBot = require('node-telegram-bot-api');

// replace the value below with the Telegram token you receive from @BotFather
const token = '938029843:AAEpRjT2iNV-l4M6DybpmCrH7uO4tN7anJk';

// Create a bot that uses 'polling' to fetch new updates
const bot = new TelegramBot(token, {polling: true});

// Matches "/echo [whatever]"
bot.onText(/\/echo (.+)/, (msg, match) => {
  // 'msg' is the received Message from Telegram
  // 'match' is the result of executing the regexp above on the text content
  // of the message

  const chatId = msg.chat.id;
  const resp = match[1]; // the captured "whatever"
  var result="CEP não encontrado!";

  var isnum = /^\d+$/.test(resp);

  if (isnum) {
    request('https://viacep.com.br/ws/'+resp+'/json/', function (error, response, body) {
      //console.log('error:', error); // Print the error if one occurred
      //console.log('statusCode:', response && response.statusCode); // Print the response status code if a response was received
      //console.log('body:', body); // Print the HTML for the Google homepage.

      var cep = JSON.parse(body);

      result = cep.logradouro + "," + cep.bairro + " , " + cep.localidade + " - " + cep.uf;

      // send back the matched "whatever" to the chat
      bot.sendMessage(chatId, result);
    });
  }

  
});