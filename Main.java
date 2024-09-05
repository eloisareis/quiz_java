public class Main {
    public static void main(String[] args) {
        Questao leia = new Questao();

        String[] perguntas = {
                "01. Quem é a única mulher que apareceu na foto: \"reunião dos maiores cientistas do mundo\" : \"A Foto Mais \n Inteligente do Mundo\"?",
                "02. Qual é o maior planeta do Sistema Solar?"
        };

        String[][] opcoes = {
                {"a. Caroline Herschel", "b. Rosalind Franklin", "c. Marie Curie", "d. Margaret Heafield", "e. Valentina Tereshkova"},
                {"a. Urano", "b. Júpiter", "c. Terra", "d. Vênus", "e. Marte"}
        };

        String[] corretas = {"c", "b"};

        for (int i = 0; i < perguntas.length; i++) {
            leia.pergunta = perguntas[i];
            leia.opcaoA   = opcoes[i][1];
            leia.opcaoB   = opcoes[i][2];
            leia.opcaoC   = opcoes[i][3];
            leia.opcaoD   = opcoes[i][4];
            leia.opcaoE   = opcoes[i][5];
            leia.correta  = corretas[i];

            leia.escrevaQuestao();
            String resposta = leia.leiaResposta();
            Boolean correta = leia.isCorreta(resposta);
        }
    }
}