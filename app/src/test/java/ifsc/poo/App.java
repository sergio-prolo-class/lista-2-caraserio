
package ifsc.poo;


import edu.princeton.cs.algs4.Draw;


public class App {
   // Atributo
   private Draw draw;


   // Construtor
   public App() {
       this.draw = new Draw();
       this.draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);


       // Ajusta o tamanho da tela
       this.draw.setCanvasSize(1000, 600); //Largura e altura


       // Ajusta a escala X
       this.draw.setXscale(0, 1000); //Define a escala X


       // Ajusta a escala Y
       this.draw.setYscale(0, 600); //Define a escala Y


       //mostra a janela
       this.draw.setVisible(true); //atualizado


   }


   // Main
   public static void main(String[] args) {
       App app = new App();
       Draw.setVisible(true);
   }
}


