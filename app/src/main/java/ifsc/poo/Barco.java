package ifsc.poo;//barco
import edu.princeton.cs.algs4.Draw;


public class Barco {//Atributos/variaveis
   private Grade grade;
   private int tamanho;
   private int posX, posY;
   private boolean vertical;
   private static final int tamanho2 = 40;
   public int X; int Y;

   public Barco(Grade grade, int tamanho, int posX, int posY, boolean vertical) {//metodo
       this.grade = grade;
       this.tamanho = tamanho;
       this.posX = posX;
       this.posY = posY;
       this.vertical = vertical;
   }

   public void desenhar(Draw draw) {
       draw.setPenRadius();
       draw.setPenColor(Draw.BLUE);//Seta a cor


       for (int i = 0; i < tamanho; i++) {
           int xPixel = grade.getX() + (posX * tamanho2);
           int yPixel = grade.getY() + (posY * tamanho2);


           if (vertical) {
               yPixel += i * tamanho2;
           } else {
               xPixel += i * tamanho2;
           }

           draw.filledRectangle(xPixel + tamanho2 / 2.0, yPixel + tamanho2 / 2.0,
                                tamanho2 / 2.0, tamanho2 / 2.0);
       }
   }
}
