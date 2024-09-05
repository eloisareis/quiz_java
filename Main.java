import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Questao leia = new Questao();
        int acertos = 0;
        int erros   = 0;

        String[] perguntas = {
                "01. Quem é a única mulher que apareceu na foto: \"reunião dos maiores cientistas do mundo\" : \"A Foto Mais \n Inteligente do Mundo\"?",
                "02. Qual é o maior planeta do Sistema Solar?",
                "03. Quem é conhecido como o \"pai da tabela periódica\"?",
                "04. Alan Turing é considerado o pai da:"
        };

        String[][] opcoes = {
                {"a. Caroline Herschel", "b. Rosalind Franklin", "c. Marie Curie", "d. Margaret Heafield", "e. Valentina Tereshkova"},
                {"a. Urano", "b. Júpiter", "c. Terra", "d. Vênus", "e. Marte"},
                {"a. Isaac Newton", "b. Amedeo Avogadro", "c. Yuan Ceo", "d. Anthony Brown", "e. Dmitri Medeleev"},
                {"a. Computação", "b. Ciência", "c. Genética", "d. Psicanalise", "e. Física"}


        };

        String[] corretas = {"c", "b", "e", "a"};

        for (int i = 0; i < perguntas.length; i++) {
            leia.pergunta = perguntas[i];
            leia.opcaoA   = opcoes[i][0];
            leia.opcaoB   = opcoes[i][1];
            leia.opcaoC   = opcoes[i][2];
            leia.opcaoD   = opcoes[i][3];
            leia.opcaoE   = opcoes[i][4];
            leia.correta  = corretas[i];

            leia.escrevaQuestao();
            String resposta = leia.leiaResposta();
            Boolean correta = leia.isCorreta(resposta);

            if (correta) {
                acertos++;
            } else {
                erros++;
            }
        }

        double porcentagemAcertos = ((double) acertos / perguntas.length) * 100;
        System.out.println("Quantidade de acertos: " + acertos);
        System.out.println("Quantidade de erros: " + erros);
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);
    }
}