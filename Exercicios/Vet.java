package Exercicios;

import java.util.Scanner;

public class Vet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd, cont = 0;
        double saldo = 0 , valor = 0 , media = 0;

        System.out.print("Digite a quantidade de valores: ");
        qtd = sc.nextInt();

        double numeros[] = new double[qtd];
  
        while ( cont < qtd ) {
            System.out.print("Digite um valor: ");
            numeros [ cont ] = sc.nextDouble();

            saldo = saldo + numeros[cont];

            cont = cont + 1;  }

        media = saldo / cont;
        cont = 0;
        
        System.out.println("Os valores são: ");
        
        while (cont < qtd ) {
            System.out.println( numeros[cont]);
            cont ++; // contador = contador + 1
        }

        System.out.println(String.format("A média é %.2f", media));

    }
}
