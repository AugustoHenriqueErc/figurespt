import java.awt.*;

/**
 * A person that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Pessoa extends Forma
{
    private int altura;
    private int comprimento;
    /**
     * Create a new person at default position with default color.
     */
    public Pessoa()
    {
        super();
        altura = 60;
        comprimento = 30;
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    @Override
    protected void mudarTamanho(int novaAltura, int novoComprimento)
    {
        apagar();
        altura = novaAltura;
        comprimento = novoComprimento;
        desenhar();
    }

    protected void desenhar()
    {
        int bh = (int)(altura * 0.7);  // body height
        int hh = (altura - bh) / 2;  // half head height
        int hw = comprimento / 2;  // half width
        int x = posiçãoX;
        int y = posiçãoY;
        if(estáVisível) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { x-3, x-hw, x-hw, x-(int)(hw*0.2)-1, x-(int)(hw*0.2)-1, x-hw, 
                              x-hw+(int)(hw*0.4)+1, x, x+hw-(int)(hw*0.4)-1, x+hw, x+(int)(hw*0.2)+1, 
                              x+(int)(hw*0.2)+1, x+hw, x+hw, x+3, x+(int)(hw*0.6), 
                              x+(int)(hw*0.6), x+3, x-3, x-(int)(hw*0.6), x-(int)(hw*0.6) };
            int[] ypoints = { y, y+(int)(bh*0.2), y+(int)(bh*0.4), y+(int)(bh*0.2), 
                              y+(int)(bh*0.5), y+bh, y+bh, y+(int)(bh*0.65), y+bh, y+bh, 
                              y+(int)(bh*0.5), y+(int)(bh*0.2), y+(int)(bh*0.4), y+(int)(bh*0.2), 
                              y, y-hh+3, y-hh-3, y-hh-hh, y-hh-hh, y-hh-3, y-hh+3 };
            canvas.draw(this, cor, new Polygon(xpoints, ypoints, 21));
            canvas.wait(10);
        }
    }

    /**
     * Erase the person on screen.
     */
    private void apagar()
    {
        if(estáVisível) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
