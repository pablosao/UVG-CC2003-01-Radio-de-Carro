
/**
 * Interfaz para el manejo de las caracteristicas basicasde una radio. 
 *
 * @author Pablo Sao
 * @version 1.1
 * @date 14/01/2019
 */
public interface Radio
{
    /**
     * Metodo para cambiar de frecuencia seleccionada en la radio.
     * 
     * @return retorna la frecuencia seleccionada
     */
    boolean cambiarAmFm();
    
    /**
     * Metodo para manejar el encendido y apagado de la radio
     * 
     * @param onOff Parametro para identificar si la radio se encendera o apagara
     */
    boolean encendidoRadio();
    
    /**
     * Metodo para subir la frecuencia que se encuentra actualmente en la radio.
     * 
     * @return Nueva frecuencia a reproducir en la radio.
     */  
    double subirFrecuencia();
    
    /**
     * Metodo para bajar la frecuencia que se encuentra actualmente en la radio.
     * 
     * @return Nueva frecuencia a reproducir en la radio.
     */  
    double bajarFrecuencia();
    
    /**
     * Metodo para almacenar la frecuencia en el boton seleccionado
     *
     * @param frecuencia frecuencia de la radio a almacenar
     * @param posicion numero del boton de favoritos seleccionado.
     */
    void setFavorito(int posicion);
    
    /**
     * Metodo para obtener la frecuencia almacenada en el boton, segun la emisora.
     *
     * @param posicion numero del boton de favoritos seleccionado.
     * @return frecuencia almacenada en el boton de favoritos.
     */
    double getFavorito(int posicion);
    
    
}
