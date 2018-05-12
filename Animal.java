/**
 * Write a description of class Animal here.
 * 
 * @author (Aitor Diez) 
 * @version (12/05/2018)
 */
public abstract class Animal
{
    //Variable para los puntos de vida del animal.
    protected int puntosDeVida;
    //Variable para el peso del animal en kilogramos.
    protected int pesoEnKilogramos;
    //Variable para el sonido caracteristico del animal.
    protected String emitirSonidoCaracteristico;
    /**
     * Constructor para los objetos de la clase animal.
     * 
     * @param puntosDeVida Los puntos de vida que tiene el animal.
     * @param pesoEnKilogramos El peso en kilogramos que tiene el animal.
     * @param emitirSonidoCaracteristico El sonido caracteristico que tiene el animal.
     */
    public Animal(int puntosDeVida, int pesoEnKilogramos, String emitirSonidoCaracteristico)
    {
        //inializacion de la variable puntosDeVida para los puntos de vida del animal.
        this.puntosDeVida = puntosDeVida;
        //inicializacion de la variable pesoEnKilogramos para el peso del animal en kilogramos.
        this.pesoEnKilogramos = pesoEnKilogramos;
        //inicializacion de la variable emitirSonidoCaracteristico para emitir el sonido caracteristico del animal.
        this.emitirSonidoCaracteristico = emitirSonidoCaracteristico;
    }

    /**
     * Metodo para que coma el animal.
     */
    public abstract void comer();
    
    /**
     * Metodo para vacunar al animal.
     */
    public abstract void vacunar();
    
    /**
     * Metodo para el peso del animal.
     */
    public abstract int getPeso();
    
    /**
     * Metodo para los puntos de vida del animal.
     */
    public abstract int getPuntosDeVida();
    
    /**
     * Metodo para que el animal emita el sonido caracteristico.
     */
    public abstract void emitirSonidoCaracteristico();
}
