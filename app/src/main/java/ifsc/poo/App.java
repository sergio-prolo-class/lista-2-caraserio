import edu.princeton.cs.algs4.Draw;
package ifsc.poo;

public class App {
   // Atributos
 private Draw draw;

 // Construtor
 public App() {
     this.draw = new Draw();
     this.draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
     // Ajusta o tamanho da tela usando algum método do objeto Draw
     // Ajusta a escala X usando algum outro método do objeto Draw
     // Ajusta a escala Y usando ainda outro método do objeto Draw
 }
// Main
 public static void main(String[] args){
     App app = new App();
     app.draw.show();
 }
 }
