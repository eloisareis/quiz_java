import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Questao leia = new Questao();
        int acertos = 0;
        int erros   = 0;

        String[] perguntas = {
                "01. Qual linguagem de programação é amplamente usada para o desenvolvimento de páginas web no lado do cliente?",
                "02. Qual dos seguintes bancos de dados é um banco de dados NoSQL?",
                "03. Qual conceito em programação orientada a objetos se refere à habilidade de uma função assumir várias formas?",
                "04. Alan Turing é considerado o pai da:",
                "05. O que significa \"CSS\" no desenvolvimento web?",
                "06. Qual foi a primeira linguagem de programação desenvolvida?",
                "07. Qual foi o primeiro microprocessador criado pela Intel?",
                "08. Qual tipo de malware é projetado para se disfarçar como um programa legítimo?",
                "09. O que é uma API (Application Programming Interface)?"
        };

        String[][] opcoes = {
                {"a. Python", "b. C++", "c. JavaScript", "d. Java", "e. Ruby"},
                {"a. MySQL", "b. MongoDB", "c. Oracle", "d. PostgreSQL", "e. SQL Server"},
                {"a. Abstração", "b. Encapsulamento", "c. Herança", "d. Coesão", "e. Polimorfismo"},
                {"a. Computação", "b. Ciência", "c. Genética", "d. Psicanalise", "e. Física"},
                {"a. Central Style System", "b. Computer Style Syntax", "c. Complex Style Set", "d. Cascading Style Sheets", "e. Code Style Sheets"},
                {"a. FORTRAN", "b.COBOL", "c.Assembly", "d.BASIC", "e. PASCAL"},
                {"a. Intel 8008", "b. Intel 8080", "c. Intel 4004", "d. Intel 80386", "e. Intel Pentium"},
                {"a. Worm", "b. Vírus", "c. Ransomware", "d. Spyware", "e. Trojan"}

        };

        //                    1    2    3    4    5    6    7    8    9    10    11
        String[] corretas = {"c", "b", "e", "a", "d", "a", "c", "e", ""};

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