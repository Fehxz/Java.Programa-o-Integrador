package Ado;

import java.util.Scanner;
import java.util.ArrayList;

public class Media05l05 {
    ArrayList<Double> valores = new ArrayList<>();

    Scanner leitor = new Scanner(System.in);

    public double lervalor() {
        System.out.print("Digite um valor real: ");
        return leitor.nextDouble();
    }

    public double mediavalores() {
        if (valores.isEmpty()) return 0;
        double soma = 0;
        for (double v : valores) {
            soma += v;
        }
        return soma / valores.size();
    }

    public int contvalores() {
        return valores.size();
    }

    public double maiorvalor() {
        if (valores.isEmpty()) return 0;
        double maior = valores.get(0);
        for (double v : valores) {
            if (v > maior) maior = v;
        }
        return maior;
    }

    public double menorvalor() {
        if (valores.isEmpty()) return 0;
        double menor = valores.get(0);
        for (double v : valores) {
            if (v < menor) menor = v;
        }
        return menor;
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Inserir valor");
            System.out.println("2 - Média dos valores");
            System.out.println("3 - Total de valores");
            System.out.println("4 - Maior valor");
            System.out.println("5 - Menor valor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    double valor = lervalor();
                    valores.add(valor);
                    break;
                case 2:
                    System.out.println("Média dos valores: " + mediavalores());
                    break;
                case 3:
                    System.out.println("Total de valores: " + contvalores());
                    break;
                case 4:
                    System.out.println("Maior valor: " + maiorvalor());
                    break;
                case 5:
                    System.out.println("Menor valor: " + menorvalor());
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    public static void main(String[] args) {
        Media05l05 app = new Media05l05();
        app.menu();
    }
}
