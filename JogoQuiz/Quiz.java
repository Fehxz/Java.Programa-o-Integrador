package JogoQuiz;

import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bem-vindo ao Jogo de Quiz!", "Quiz", JOptionPane.INFORMATION_MESSAGE);

        int numJogadores = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos jogadores irão participar?", "Número de Jogadores", JOptionPane.QUESTION_MESSAGE));

        String[] jogadores = new String[numJogadores];
        int[] pontos = new int[numJogadores];

        for (int i = 0; i < numJogadores; i++) {
            jogadores[i] = JOptionPane.showInputDialog(null, "Qual é o seu nome, Jogador " + (i + 1) + "?", "Usuário", JOptionPane.QUESTION_MESSAGE);
            pontos[i] = 0;
        }

        String[] niveis = {"Fácil", "Médio", "Difícil"};
        String nivelEscolhido = (String) JOptionPane.showInputDialog(null, "Escolha o nível de dificuldade:", "Nível", JOptionPane.QUESTION_MESSAGE, null, niveis, niveis[0]);

        String[][] perguntas;
        
        if ("Fácil".equalsIgnoreCase(nivelEscolhido)) {
            perguntas = new String[][] {
                {"Qual palavra-chave é usada para definir uma classe em Java?", "class"},
                {"Qual linguagem é usada para rodar programas em várias plataformas?", "java"},
                {"Qual é o nome do método que inicia um programa Java?", "main"},
                {"Qual tipo de dado usamos para números inteiros?", "int"},
                {"Java é uma linguagem de programação orientada a...?", "objetos"}
            };
        } else if ("Médio".equalsIgnoreCase(nivelEscolhido)) {
            perguntas = new String[][] {
                {"Qual comando cria um laço que executa enquanto a condição for verdadeira?", "while"},
                {"Palavra usada para importar pacotes em Java?", "import"},
                {"Tipo de dados que armazena valores verdadeiros ou falsos?", "boolean"},
                {"Operador que compara referências de objetos?", "=="},
                {"Qual símbolo é usado para comentar uma linha em Java?", "//"}
            };
        } else { // Difícil
            perguntas = new String[][] {
                {"Palavra que define que um método ou classe pode ser acessado por qualquer outro código?", "public"},
                {"Comando usado para sair de um loop imediatamente?", "break"},
                {"Qual modificador limita o acesso somente à própria classe?", "private"},
                {"Comando que termina um método e retorna um valor?", "return"},
                {"Conceito de reutilizar código entre classes?", "herança"}

            };
        }

        for (int i = 0; i < perguntas.length; i++) {
            String pergunta = perguntas[i][0];
            String respostaCorreta = perguntas[i][1];

            for (int j = 0; j < numJogadores; j++) {
                String resposta = JOptionPane.showInputDialog(null, jogadores[j] + ", " + pergunta, "Pergunta", JOptionPane.QUESTION_MESSAGE);
                if (resposta != null && resposta.trim().equalsIgnoreCase(respostaCorreta)) {
                    pontos[j]++;
                }
            }
        }

        String resultado = "Pontuação Final:\n";
        int maiorPontuacao = -1;
        String vencedores = "";

        for (int i = 0; i < numJogadores; i++) {
            resultado += jogadores[i] + ": " + pontos[i] + " pontos\n";
            if (pontos[i] > maiorPontuacao) {
                maiorPontuacao = pontos[i];
                vencedores = jogadores[i];
            } else if (pontos[i] == maiorPontuacao) {
                vencedores += ", " + jogadores[i];
            }
        }

        if (vencedores.contains(",")) {
            resultado += "\nEmpate entre: " + vencedores + "!";
        } else {
            resultado += "\nO vencedor é: " + vencedores + "!";
        }

        JOptionPane.showMessageDialog(null, resultado, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}