public class Main {
    public static void main(String[] args) {
        Questao leia = new Questao();
        int acertos = 0;
        int erros   = 0;

        String[] perguntas = {
                " 01. Qual linguagem de programação é amplamente usada para o desenvolvimento de páginas web no lado do \n cliente?",
                " 02. Qual dos seguintes bancos de dados é um banco de dados NoSQL?",
                " 03. Qual conceito em programação orientada a objetos se refere à habilidade de uma função assumir várias \n formas?",
                " 04. Alan Turing é considerado o pai da:",
                " 05. O que significa \"CSS\" no desenvolvimento web?",
                " 06. Qual foi a primeira linguagem de programação desenvolvida?",
                " 07. Qual foi o primeiro microprocessador criado pela Intel?",
                " 08. Qual tipo de malware é projetado para se disfarçar como um programa legítimo?",
                " 09. O que é uma API (Application Programming Interface)?",
                " 10. Qual é o principal propósito do protocolo HTTP?",
                " 11. Qual das seguintes linguagens é mais conhecida por sua velocidade e uso em sistemas de baixo nível?",
                " 12. Qual linguagem é usada para interagir com bancos de dados relacionais?",
                " 13. Qual destes é um sistema de controle de versão que permite o trabalho colaborativo em projetos de \n software?",
                " 14. Qual linguagem de programação é conhecida por sua simplicidade e é amplamente usada para scripts \n automáticos e automação de tarefas?",
                " 15. Qual foi o primeiro motor de busca na internet?"
        };

        String[][] opcoes = {
                {" a. Python", " b. C++", " c. JavaScript", " d. Java", " e. Ruby"},                                                                       //1
                {" a. MySQL", " b. MongoDB", " c. Oracle", " d. PostgreSQL", " e. SQL Server"},                                                            //2
                {" a. Abstração", " b. Encapsulamento", " c. Herança", " d. Coesão", " e. Polimorfismo"},                                                  //3
                {" a. Computação", " b. Ciência", " c. Genética", " d. Psicanalise", " e. Física"},                                                        //4
                {" a. Central Style System", " b. Computer Style Syntax", " c. Complex Style Set", " d. Cascading Style Sheets", " e. Code Style Sheets"}, //5
                {" a. FORTRAN", " b. COBOL", " c. Assembly", " d. BASIC", " e. PASCAL"},                                                                   //6
                {" a. Intel 8008", " b. Intel 8080", " c. Intel 4004", " d. Intel 80386", " e. Intel Pentium"},                                            //7
                {" a. Worm", " b. Vírus", " c. Ransomware", " d. Spyware", " e. Trojan"},                                                                  //8
                {" a. Um tipo de linguagem de programação", " b. Um conjunto de funções e procedimentos que permitem a comunicação entre sistemas", " c. Um algoritmo para inteligência artificial",
                        " d. Um banco de dados relacional", " e. Um editor de código"},                                                                    //9
                {" a. Transferir arquivos entre dois computadores", " b. Fazer backup de dados", " c. Proteger conexões de rede",                          //10
                        " d. Facilitar a comunicação entre clientes e servidores na web", " e. Criptografar dados sensíveis"},                             //10
                {" a. PHP", " b. Python", " c. C", " d. Ruby", " e. JavaScript"},                                                                          //11
                {" a. SQL", " b. CSS", " c. JavaScript", " d. Bash", " e. XML"},                                                                           //12
                {" a. Visual Studio", " b. GitHub", " c. Slack", " d. Docker", " e. Jenkins"},                                                             //13
                {" a. C++", " b. Java", " c. Assembly", " d. Python", " e. Rust"},                                                                         //14
                {" a. Yahoo", " b. AltaVista", " c. Google", " d. WebCrawler", " e. Archie"}                                                               //15
        };

        //                    1    2    3    4    5    6    7    8    9   10   11   12   13    14   15
        String[] corretas = {"c", "b", "e", "a", "d", "a", "c", "e", "b", "d", "c", "a", "b", "d", "e"};

        System.out.println("");
        System.out.println("|-------------------------------------------------------------------------------------------------------|");
        System.out.println("|   Centro Universitário Alfredo Nasser                                                                 |");
        System.out.println("|   Eloisa de Castro Reis                                                                               |");
        System.out.println("|   Brenno Pimenta                                                                                      |");
        System.out.println("|                                                                                                       |");
        System.out.println("|   - Olá! Bem vindos. Abaixo você irá responder um quiz de 15 perguntas com 5 alternativas. O tema do  |");
        System.out.println("|  quiz é Tecnologia e Programação. Boa sorte!                                                          |");
        System.out.println("|-------------------------------------------------------------------------------------------------------|");
        System.out.println("");

        System.out.println("                                                   Perguntas");
        System.out.println("");


        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("|-------------------------------------------------------------------------------------------------------|");
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

        System.out.println("|-------------------------------------------------------------------------------------------------------|");
        double porcentagemAcertos = ((double) acertos / perguntas.length) * 100;
        System.out.println(" Resultados");
        System.out.println("");
        System.out.println(" Quantidade de acertos: " + acertos);
        System.out.println(" Quantidade de erros: " + erros);
        System.out.printf(" Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);
    }
}