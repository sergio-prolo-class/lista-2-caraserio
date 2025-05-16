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
        this.draw.setCanvasSize(1000, 600); // Largura e altura

        // Ajusta a escala X
        this.draw.setXscale(0, 1000); // Define a escala X

        // Ajusta a escala Y
        this.draw.setYscale(0, 600); // Define a escala Y

        // Mostra a janela
        this.draw.setVisible(true);
    }

    // Main
    public static void main(String[] args) {
        App app = new App();

        Grade grade = new Grade(50, 50);
        grade.desenhar(app.draw);

        Grade grade1 = new Grade(500, 50);
        grade1.desenhar(app.draw);

        Barco barco = new Barco(grade, 3, 0, 0, true);
        barco.desenhar(app.draw);
        // Desenha os barcos
        Barco barco1 = new Barco(grade,2,0,8,false);
        barco1.desenhar(app.draw);

        Barco barco2 = new Barco(grade,3,5,0,true);
        barco2.desenhar(app.draw);

        Barco barco3 = new Barco(grade,4,2,4,false);
        barco3.desenhar(app.draw);

        Barco barco4 = new Barco(grade,5,9,5,true);
        barco4.desenhar(app.draw);

        Barco barco5 = new Barco(grade,4,7,5,true);
        barco5.desenhar(app.draw);


    }
}