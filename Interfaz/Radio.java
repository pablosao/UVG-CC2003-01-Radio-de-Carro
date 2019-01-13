
/**
 * 
 *
 * @author Pablo Sao
 * @version 1
 * @date 13/01/2018
 */
public interface Radio
{
      
    double subir_frecuencia(double frecuencia,boolean emisora);
    
    double bajar_frecuencia(double frecuencia,boolean emisora);
    
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    void setFavorito(double frecuencia, boolean emisora,int posicion);
    
    /**
     * Metodo para obtener la frecuencia almacenada en el boton, segun la emisora.
     *
     * @param emisora parametro para identificar AM y FM.
     * @param posicion numero del boton de favoritos seleccionado.
     * @return frecuencia almacenada en el boton de favoritos.
     */
    double getFavorito(boolean emisora,int posicion);
    
    
}
