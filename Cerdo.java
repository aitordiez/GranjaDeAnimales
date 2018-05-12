/**
 * Write a description of class Cerdo here.
 * 
 * @author (Aitor Diez) 
 * @version (12/05/2018)
 */
public class Cerdo extends Animal
{
    /**
     * Constructor para los objetos de la clase Cerdo.
     */
    public Cerdo()
    {
        super(100, 15, "OING OING");
    }

    /**
     * Metodo para que coma el animal(cerdo). 
     */
    public void comer()
    {
        pesoEnKilogramos += 2;
        puntosDeVida -= 10;
    }
    
    /**
     * Metodo para vacunar al animal(cerdo).
     */
    public void vacunar()
    {
        puntosDeVida += 20; 
    }
    
    /**
     * Metodo que devuelve el peso del animal(cerdo).
     * 
     * @return El peso que tiene el animal(cerdo).
     */
    public int getPeso()
    {
        return pesoEnKilogramos;
    }
    
    /**
     * Metodo que devuelve los puntos de vida que tiene el animal(cerdo).
     * 
     * @return Los puntos de vida que tiene el animal(cerdo).
     */
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }
    
    /**
     * Metodo que imprime el sonido caracteristico del animal(cerdo).
     */
    public void emitirSonidoCaracteristico()
    {
        System.out.println(emitirSonidoCaracteristico);
    }
}
