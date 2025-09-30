##
### Tasks
Subir um web server 
colocar uma mensagem  oa acessar 
criar um arquivo dentro do web server
visualizar o arquilo de log em tempo real

`service {nameservice}` = é utilizado para subir serviços dentro do SO
        "service apache2 start"
        - start = inicia o serviço
        - status = mostra o status do serviço
        - stop = para o serviço

`netstat` = utilizado para exibir estatísticas de protocolo e conexões de rede TCP/IP atuais.

`tail` = filtra as 5 ULTIMAS linhas do arquivo
        "-f" filtra em tempo real, como monitoramento

`head` = filtra as 5 PRIMEIRAS linhas do arquivo
`grep` = filtrar linhas especificas
        ex: cat password.txt | grep "1" (vai filtrar todas as linhas que possuem o numero "1" no arquivo password.txt)

        ex2: [ grep "/bin/bash" /etc/passwd > temshell ] = grep filtra as linhas que contém "/bin/bash" do arquivo PASSWD e joga essa filtragem para o arquivo chamado "temshell"

        caso eu use o "-v" no GREP ele filtra excluindo as linhas ao qual defini na filtragem ex: grep -v "nologin" removendo linhas que contem "nologuin"

`egrep` = utilizado para filtragem de mais de uma palavra na linha específica
        [ ex: egrep "senha|login" ../leaked.txt ] = vai filtrar as linhas que possuem login ou linhas que possuem senha.
`awk` = utilizado para filtrar apenas uma coluna especifica
        
        "root:x:0:0:root:/root:/bin/bash" -- linha exemplo
        ex: awk -F : '{print $1}' /etc/passwd
         
``
``
``
``
