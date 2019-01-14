
/**
 * Interfaz para el manejo de las caracteristicas basicasde una radio. 
 *
 * @author Pablo Sao
 * @version 1.1
 * @date 14/01/2019
 */
public interface iRadio
{
    /**
     * Metodo para cambiar de frecuencia seleccionada en la radio.
     * 
     * @param amFM cambia la frecuencia de AM a FM
     */
    void cambiarFrecuencia(boolean amFM);
    
    /**
     * Metodo para manejar el encendido y apagado de la radio
     * 
     * @param onOff Parametro para identificar si la radio se encendera o apagara
     */
    void encendidoRadio(boolean onOff);
    
    /**
     * Metodo para subir la frecuencia que se encuentra actualmente en la radio.
     * 
     * @param frecuencia Frecuencia que se encuentra actualmente en la radio.
     * @param emisora Emisora que se encuentra seleccionada en la radio (AM/FM).
     * @return Nueva frecuencia a reproducir en la radio.
     */  
    double subirEmisora(double frecuencia,boolean emisora);
    
    /**
     * Metodo para bajar la frecuencia que se encuentra actualmente en la radio.
     * 
     * @param frecuencia Frecuencia que se encuentra actualmente en la radio.
     * @param emisora Emisora que se encuentra seleccionada en la radio (AM/FM).
     * @return Nueva frecuencia a reproducir en la radio.
     */  
    double bajarEmisora(double frecuencia,boolean emisora);
    
    /**
     * Metodo para almacenar la frecuencia en el boton seleccionado
     *
     * @param frecuencia frecuencia de la radio a almacenar
     * @param posicion numero del boton de favoritos seleccionado.
     */
    void setFavorito(double frecuencia,int posicion);
    
    /**
     * Metodo para obtener la frecuencia almacenada en el boton, segun la emisora.
     *
     * @param posicion numero del boton de favoritos seleccionado.
     * @return frecuencia almacenada en el boton de favoritos.
     */
    double getFavorito(int posicion);
    
    
}
