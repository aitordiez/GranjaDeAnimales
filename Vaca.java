/**
 * Write a description of class Vaca here.
 * 
 * @author (Aitor Diez) 
 * @version (12/05/2018)
 */
public class Vaca extends Animal
{
    /**
     * Constructor para los objetos de la clase Vaca.
     */
    public Vaca()
    {
        super(100, 25, "MUU MUU");
    }

    /**
     * Metodo para que coma el animal(vaca).
     */
    public void comer()
    {
        pesoEnKilogramos += 2;
        puntosDeVida -= 10;
    }
    
    /**
     * Metodo para vacunar al animal(vaca).
     */
    public void vacunar()
    {
        puntosDeVida += 30;
    }
    
    /**
     * Metodo que devuelve el peso del animal(vaca).
     * 
     * @return El peso del animal(vaca).
     */
    public int getPeso()
    {
        return pesoEnKilogramos;
    }
    
    /**
     * Metodo que devuelve los puntos de vida del animal(vaca).
     * 
     * @return Los puntos de vida del animal(vaca).
     */
    public int getPuntosDeVida(){
        return puntosDeVida;
    }
    
    /**
     * Metodo que imprime el sonido caracteristico del animal(vaca).
     */
    public void emitirSonidoCaracteristico()
    {
        System.out.println(emitirSonidoCaracteristico);
    }
}
