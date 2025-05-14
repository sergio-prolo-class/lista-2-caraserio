import java.awt.Font;

public class Grade {
    private int x;
    private int y;
    private static final int TAMANHO_CELULA = 40;
    private static final int NUM_LINHAS = 10;
    private static final int NUM_COLUNAS = 10;

    public Grade(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw draw) {
        draw.setFont(new Font("Arial", Font.PLAIN, 12));

        // Desenhar as linhas horizontais
        for (int i = 0; i <= NUM_LINHAS; i++) {
            int yAtual = y + i * TAMANHO_CELULA;
            draw.line(x, yAtual, x + NUM_COLUNAS * TAMANHO_CELULA, yAtual);
        }

        // Desenhar as linhas verticais
        for (int j = 0; j <= NUM_COLUNAS; j++) {
            int xAtual = x + j * TAMANHO_CELULA;
            draw.line(xAtual, y, xAtual, y + NUM_LINHAS * TAMANHO_CELULA);
        }

        // Rótulos das colunas (A-J)
        for (int j = 0; j < NUM_COLUNAS; j++) {
            char letra = (char) ('A' + j);
            int xLetra = x + j * TAMANHO_CELULA + TAMANHO_CELULA / 2 - 5;
            int yLetra = y - 5; // Acima da grade
            draw.text(xLetra, yLetra, String.valueOf(letra));
        }

        // Rótulos das linhas (1-10)
        for (int i = 0; i < NUM_LINHAS; i++) {
            int numero = NUM_LINHAS - i;
            int xNumero = x - 20; // À esquerda da grade
            int yNumero = y + i * TAMANHO_CELULA + TAMANHO_CELULA / 2 + 5;
            draw.text(xNumero, yNumero, String.valueOf(numero));
        }
    }
}


