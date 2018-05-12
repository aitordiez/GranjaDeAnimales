/**
 * Write a description of class Pollo here.
 * 
 * @author (Aitor Diez) 
 * @version (12/05/2018)
 */
public class Pollo extends Animal
{
    /**
     * Constructor para los objetos de la clase Pollo.
     */
    public Pollo()
    {
        super(100, 1, "Pio Pio");
    }

    /**
     * Metodo para dar de comer al animal(pollo).
     */
    public void comer()
    {
        pesoEnKilogramos += 1;
        puntosDeVida = puntosDeVida - 10;
    }
    
    /**
     * Metodo para vacunar al animal(pollo).
     */
    public void vacunar()
    {
        puntosDeVida = puntosDeVida + 10;
    }
    
    /**
     * Metodo que devuelve el peso en kilogramos del animal(pollo).
     * 
     * @return El peso en kilogramos del animal(pollo).
     */
    public int getPeso()
    {
        return pesoEnKilogramos;
    }
    
    /**
     * Metodo que devuelve los puntos de vida que tiene el animal(pollo).
     * 
     * @return Los puntos de vida que tiene el animal.
     */
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }
    
    /**
     * Metodo que imprime el sonido caracteristico del animal(pollo).
     */
    public void emitirSonidoCaracteristico()
    {
        System.out.println(emitirSonidoCaracteristico);
    }
}
