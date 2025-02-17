import java.awt.*;
import java.awt.geom.*;

/**
 * Um círculo que pode ser manipulado e que desenha a si mesmo em uma tela.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Círculo extends FormaGeometrica
{
    private int diâmetro;
    /**
     * Cria um novo círculo na posição padrão com a cor padrão.
     */
    public Círculo()
    {
        super();
        diâmetro = 68;
    }

    /**
     * Muda o tamanho para o novo valor (em pixels). Tamanho precise ser >= 0.
     */
    public void mudarTamanho(int novoDiâmetro, int x)
    {
        apagar();
        diâmetro = novoDiâmetro;
        desenhar();
    }

    /**
     * Desenha o círculo com as especificações atuais na tela.
     */
    @Override
    protected void desenhar()
    {
        if(estáVisível) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, cor, new Ellipse2D.Double(posiçãoX, posiçãoY, 
                                                          diâmetro, diâmetro));
            canvas.wait(10);
        }
    }

}
