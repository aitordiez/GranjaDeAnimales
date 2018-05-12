/**
 * Write a description of class Pato here.
 * 
 * @author (Aitor Diez) 
 * @version (12/05/2018)
 */
public class Pato extends Animal
{
    /**
     * Constructor para los objetos de la clase Pato.
     */
    public Pato()
    {
        super(100, 2 , "CUAC CUAC");
    }

    /**
     * Metodo para que coma el animal(pato). 
     */
    public void comer()
    {
        pesoEnKilogramos += 1;
        puntosDeVida -= 10;
    }
    
    /**
     * Metodo que devuelve el peso del animal(pato).
     * 
     * @return El peso del animal(pato).
     */
    public int getPeso()
    {
        return pesoEnKilogramos;
    }
    
    /**
     * Metodo que devuelve los puntos de vida del animal(pato).
     * 
     * @return Los puntos de vida que tiene el animal(pato).
     */
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }
    
    /**
     * Metodo que imprime el sonido caracteristico del animal(pato).
     */
    public void emitirSonidoCaracteristico()
    {
        System.out.println(emitirSonidoCaracteristico);
    }
    
    /**
     * Metodo para vacunar al animal(pato).
     */
    public void vacunar()
    {
    }
}
