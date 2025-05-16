package ifsc.poo;//grade
import edu.princeton.cs.algs4.Draw;


public class Grade {
   private int x;
   private int y;
   private static final int tamanho = 40;
   private static final int linhas = 10;
   private static final int colunas = 10;


   public Grade(int x, int y) {
       this.x = x;
       this.y = y;
   }


   public void desenhar(Draw draw) {
       // draw.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12)); // Removido


       // Eixo x
       for (int i = 0; i <= linhas; i++) {
           int y2 = y + i * tamanho;
           draw.line(x, y2, x + colunas * tamanho, y2);
       }


       // Eixo y
       for (int j = 0; j <= colunas; j++) {
           int x2 = x + j * tamanho;
           draw.line(x2, y, x2, y + linhas * tamanho);
       }


       // Letras das colunas
       for (int j = 0; j < colunas; j++) {
           char letra = (char) ('A' + j);
           int xletra = x + j * tamanho + tamanho / 2 - 5;
           int yletra = y - 5;
           draw.text(xletra, yletra, String.valueOf(letra));
       }


       // Números das linhas
       for (int i = 0; i < linhas; i++) {
           int numero = linhas - i;
           int xNumero = x - 20;
           int yNumero = y + i * tamanho + tamanho / 2 + 5;
           draw.text(xNumero, yNumero, String.valueOf(numero));
       }
   }


   public int getX() { return x; }
   public int getY() { return y; }
}
