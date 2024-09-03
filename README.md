# quiz_java
Trabalho de Algoritmos e Programação II - Quiz  de 15 perguntas usando Linguagem de Programação Java.

Centro Universitário Alfredo Nasser

Eloisa de Castro Reis

Brenno Pimenta



Conteúdo:


Trabalho:
* Deverá ser criado pelo aluno um sistema de Quiz (Perguntas e Respostas) usando Linguagem de Programação Java.
- O sistema deverá ter 15 perguntas objetivas com 5 opções de resposta sendo uma alternativa correta.
- As perguntas deverão seguir um unico tema, a escolha do aluno, com exceção dos temas: Politica, Religião, Futebol.
- O Sistema deverá obrigatoriamente utilizar a classe Questao entregue neste email.
- O Sistema deverá obrigatoriamente conter no inicio da execução: Escrita do Cabeçalho na tela, contendo Nome da Faculdade, Nome Completo do Aluno, Nome do Professor, seguindo de uma mensagem de boas vindas para o usuário informando que ele responderá 15 perguntas de multipla escolha do tema escolhido.
- Ao final, o sistema deverá informar o usuário a quantidade de questões que acertou, a quantidade de questão que errou e a porcentagem dos acertos.
- O trabalho deverá ser entregue através do email (brennocripto1@gmail.com) contendo a seguinte estrutura:
         *Remetente: email_pessoal
         *Assunto: nome_completo_TURMA  ex: brenno_pimenta_da_costa_ESN2
         * conteúdo: Link do repositório do GuitHUB pessoal que está armazenado o projeto com o código java.

- O Repositório deverá conter um historico de pelo menos 10 envios de código commits/Push
- O Projeto deve estar pronto para ser clonado e executado em uma maquina com JDK instalado.

- Para V1 será avaliado o repositório de código criado e o projeto iniciado no Github.
- Para V2 será cobrado todo o projeto bem como a execução/apresentação em sala.




// CLASSE PARA O TRABALHO
public class Questao {
   String pergunta = "";
   String opcaoA = "";
   String opcaoB = "";
   String opcaoC = "";
   String opcaoD = "";
   String opcaoE = "";
   String correta = "";
   
   public boolean isCorreta(String resposta){
       if(resposta.equalsIgnoreCase(this.correta)){
           System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
System.out.println("");
           return true;
       } else {
           System.out.println("Resposta Errada!");
           System.out.println("A opção correta é a letra: " + this.correta);
System.out.println("");
           return false;
       }
   }

public String leiaResposta() {
    Scanner ler = new Scanner(System.in);
    String resp;
    do {
System.out.println("Digite a resposta: ");
resp = ler.next();
} while (!respostaValida(resp));
return resp;
}

private boolean respostaValida(String resp){
    if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
    resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
      return true;
    }
    System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
System.out.println("");
    return false;
}
   
   public void escrevaQuestao(){
       System.out.println(this.pergunta);
       System.out.println();
       System.out.println(this.opcaoA);
       System.out.println(this.opcaoB);
       System.out.println(this.opcaoC);
       System.out.println(this.opcaoD);
       System.out.println(this.opcaoE);
       System.out.println();
   }
   
}
