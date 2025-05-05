package Exec;

import java.util.Scanner;

public class Acum {

    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);

        String resp = "sim";
        int valor =  0;
        double saldo = 0;

        while ( resp.equals("sim") ) {
            System.out.print("Digite o valor: ");
            valor = sc.nextInt();
            saldo = saldo + valor;

            System.out.print("Deseja continuar? ");
            resp = sc.next();
        }

        System.out.println("Saldo Acumulado: " + saldo);
    }
    
}
