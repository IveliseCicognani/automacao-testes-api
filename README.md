#Desafio API

##Desenvolver Testes baseados nos cenários abaixo:

URL: https://viacep.com.br/ws/91060900/json

Cenário 1: Consulta CEP Válido
Dado que o usuário insere um CEP válido
Quando o serviço é consultado
Então é retornado o CEP, logradouro, complemento, bairro, localidade, uf e ibge

Cenário 2: Consulta CEP inexistente
Dado que o usuário insere um CEP que não exista na base dos Correios
Quando o serviço é consultado
Então é retornado um atributo erro

Cenário 3: Consulta CEP com formato inválido
Dado que o usuário insere um CEP com formato inválido
Quando o serviço é consultado
Então é retornado uma mensagem de erro

##Extras: 

Criar um cenário que verifique o retorno do serviço abaixo:
URL: https://viacep.com.br/ws/RS/Gravatai/Barroso/json



