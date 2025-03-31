package Exercicios;

public class Inc {

    public static void main (String[] args) {
        int num = 10, cont = 0, dim = 20;

        while (cont < num ) {
            cont = cont + 1;
            dim = dim - 5; 
        }

        System.out.println("Contagem = " + cont);
        System.out.println("Decremento = " + dim);
    }
}