/**
 * Write a description of class Granja here.
 * 
 * @author (Aitor Diez) 
 * @version (12/05/2018)
 */
public class Granja
{
    /**
     * Constructor for objects of class Granja
     */
    public Granja()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void alimentar(Animal animalAlimento)
    {
        Animal animal = animalAlimento;
        animal.comer();
    }
    
    /**
     * 
     */
    public void vacunar(Animal animalVacunado)
    {
        Animal animal = animalVacunado;
        if(animalVacunado instanceof Pato ){
            System.out.println("Este animal no se puede vacunar");
        }else{
            animal.vacunar();
        }
    }
    
    /**
     * 
     */
    public void emitirSonidoCaracteristico(Animal animalSonido)
    {
       Animal animal = animalSonido;
       animal.emitirSonidoCaracteristico();
    }
}
