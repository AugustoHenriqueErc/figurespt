import java.util.ArrayList;

/**
 * Escreva uma descrição da classe Composite aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Composite extends FormaGeometrica
{
    private ArrayList<FormaGeometrica> formasGeometricas;
    public Composite()
    {
        super();
        formasGeometricas = new ArrayList<>();
    }
    
    public void add(FormaGeometrica object)
    {
        formasGeometricas.add(object);
    }
    
    public void remove(FormaGeometrica object) 
    {
        formasGeometricas.remove(object);
    }
    
    @Override
    public void tornarVisível()
    {
        for(FormaGeometrica object: formasGeometricas) object.tornarVisível();
    }
    
    @Override
    public void tornarInvisível()
    {
        for(FormaGeometrica object: formasGeometricas) object.tornarInvisível(); 
    }
    
    @Override
    public void moverDireita()
    {
        for(FormaGeometrica object: formasGeometricas) object.moverHorizontal(20);  
    }
    
    @Override
    public void moverEsquerda()
    {
        for(FormaGeometrica object: formasGeometricas) object.moverHorizontal(-20); 
    }
    
    @Override
    public void moverCima()
    {
        for(FormaGeometrica object: formasGeometricas) object.moverVertical(-20); 
    }
    
    @Override
    public void moverBaixo()
    {
        for(FormaGeometrica object: formasGeometricas) object.moverVertical(20); 
    }
    
    @Override
    public void moverHorizontal(int distância)
    {
        for(FormaGeometrica object: formasGeometricas) object.moverHorizontal(distância);
    }
    
    @Override
    public void moverVertical(int distância)
    {
        for(FormaGeometrica object: formasGeometricas) object.moverVertical(distância);
    }
    
    @Override
    public void moverHorizontalLentamente(int distância)
    {
        for(FormaGeometrica object: formasGeometricas) object.moverHorizontalLentamente(distância);
    }
    
    @Override
    public void mudarCor(String novaCor)
    {
        for(FormaGeometrica object: formasGeometricas) object.mudarCor(novaCor);
    }
    
    @Override
    public void desenhar()
    {
         for(FormaGeometrica object: formasGeometricas) object.desenhar();
    }
    
    @Override
    public void apagar()
    {
        for(FormaGeometrica object: formasGeometricas) object.apagar();
    }
}
