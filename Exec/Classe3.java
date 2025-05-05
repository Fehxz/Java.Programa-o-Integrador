package Exec;

import java.util.Scanner;

public class Classe3 {
    double cont = 0, salario, salariomaior = 0, salariomenor = 0, media = 0, saldo = 0;

    public void salarios(Scanner leitor) {
        System.out.println("\nSalário:");
        salario = leitor.nextDouble();
        cont++;
        
        if (cont == 1) {
            salariomenor = salario;
            salariomaior = salario;
        }
        
        if (salario < salariomenor) {
            salariomenor = salario;
        }
        
        if (salario > salariomaior) {
            salariomaior = salario;
        }
        
        saldo += salario;
        media = saldo / cont;
    }

    public void exibir() {
        System.out.println("\nSalário Menor: " + salariomenor);
        System.out.println("\nSalário Maior: " + salariomaior);
        System.out.println("\nMédia de Salários: " + media);
        System.out.println("\nSaldo dos Salários: " + saldo);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Classe3 m = new Classe3();
        
        m.salarios(leitor);
        m.salarios(leitor);
        m.salarios(leitor);
        m.salarios(leitor);
        
        m.exibir();
    }
}
