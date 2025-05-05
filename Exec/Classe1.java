package Exec;

public class Classe1 {
    
    public int contarZeros(String texto) {
        int cont = 0;
        int contzeros = 0;
        String x;
        
        while (cont < texto.length()) {
          x = texto.substring(cont, cont + 1);

          if (x.equals("0")){
            contzeros ++;
          } cont ++;
        }
        
        return contzeros; // fim contador zeros
    }

    public void executar() {
        String t = "prog00124000els";
        int contZeros = contarZeros(t);
        
        System.out.println("\nQuantidade de zeros: " + contZeros);
    }

    public static void main(String[] args) {
        Classe1 m = new Classe1();
        m.executar();
    }
}
