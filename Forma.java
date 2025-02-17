
/**
 * Escreva uma descrição da classe Forma aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Forma
{
    protected int posiçãoX;
    protected int posiçãoY;
    protected String cor;
    protected boolean estáVisível;

    /**
     * Create a new person at default position with default color.
     */
    public Forma()
    {
        posiçãoX = 0;
        posiçãoY = 0;
        cor = "azul";
        estáVisível = false; 
    }

    /**
     * Make this triangle visible. If it was already visible, do nothing.
     */
    protected void tornarVisível()
    {
        estáVisível = true;
        desenhar();
    }
    
    /**
     * Make this triangle invisible. If it was already invisible, do nothing.
     */
    protected void tornarInvisível()
    {
        apagar();
        estáVisível = false;
    }
    
    /**
     * Move the triangle a few pixels to the right.
     */
    protected void moverDireita()
    {
        moverHorizontal(20);
    }

    /**
     * Move the triangle a few pixels to the left.
     */
    protected void moverEsquerda()
    {
        moverHorizontal(-20);
    }

    /**
     * Move the triangle a few pixels up.
     */
    protected void moverCima()
    {
        moverVertical(-20);
    }

    /**
     * Move the triangle a few pixels down.
     */
    protected void moverBaixo()
    {
        moverVertical(20);
    }

    /**
     * Move the triangle horizontally by 'distance' pixels.
     */
    protected void moverHorizontal(int distância)
    {
        apagar();
        posiçãoX += distância;
        desenhar();
    }

    /**
     * Move the triangle vertically by 'distance' pixels.
     */
    protected void moverVertical(int distância)
    {
        apagar();
        posiçãoY += distância;
        desenhar();
    }

    /**
     * Slowly move the triangle horizontally by 'distance' pixels.
     */
    protected void moverHorizontalLentamente(int distância)
    {
        int delta;

        if(distância < 0) 
        {
            delta = -1;
            distância = -distância;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distância; i++)
        {
            posiçãoX += delta;
            desenhar();
        }
    }

    /**
     * Slowly move the triangle vertically by 'distance' pixels.
     */
    protected void moverVerticalLentamente(int distância)
    {
        int delta;

        if(distância < 0) 
        {
            delta = -1;
            distância = -distância;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distância; i++)
        {
            posiçãoY += delta;
            desenhar();
        }
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    protected abstract void mudarTamanho(int novo);
    
    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    protected void mudarCor(String novaCor)
    {
        cor = novaCor;
        desenhar();
    }

    /**
     * Draw the person with current specifications on screen.
     */
    protected abstract void desenhar();
  
    /**
     * Erase the person on screen.
     */
    protected void apagar()
    {
        if(estáVisível) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
