package Exercicios;

import java.util.Scanner;

public class Salario {

static final int n = 3;
static int linha = -1;

static double salario[] = new double[n];
static int[] idade = new int[n];
static String[] nomes = new String[n]; 

    
public static void novaLinha(Scanner leitor) {
    linha += 1;

    System.out.println("\nDigite o nome, salário e idade:");

    System.out.print("Nome: ");
    nomes[linha] = leitor.next(); 

    System.out.print("Salário: R$ ");
    salario[linha] = leitor.nextDouble(); 

    System.out.print("Idade: ");
    idade[linha] = leitor.nextInt();     
    }

public static void main(String args[]) {

    Scanner leitor = new Scanner(System.in);
    double aux, itemMenu;

    while (true) {
        System.out.print("\n1- Ler Dados\n2- Mostrar Dados\n3- Sair\nOpção: ");
        itemMenu = leitor.nextInt();

     if (itemMenu == 1) {
                novaLinha(leitor);
            } else if (itemMenu == 2) {
                System.out.println("\nNome           Salário (R$)   Aumento (R$)   Idade");

                for (int i = 0; i <= linha; i++) {
                    aux = salario[i] * 1.1; 
                    System.out.printf("%-15s %-15.2f %-15.2f %-10d\n", 
                        nomes[i], salario[i], aux, idade[i]);
                }
            } else if (itemMenu == 3) {
                break;
            } else {
                System.out.println("\nOpção inválida. Tente novamente.");
            }
        }

        System.exit(0);  // Encerra o programa
    }
}
