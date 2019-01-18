import java.util.ArrayList;
import java.util.Arrays;

/*
 * ====================================================================================================================
 * Modifico: Pablo Sao
 * Fecha: 16/01/2019
¨* Descripción: Se empieza a agregarle logica al programa, con el requerimiento del cambio de frecuencias
  * ====================================================================================================================
 */

/**
 * Controlador de los eventos de la radio implementando la interfaz iRadio
 * @author pablo
 * @version 1.0
 */
public class Controlador implements iRadio{
    
    private double  MIN_FM = 87.90; //Variable estatica para la frecuencia minima de FM
    private double  MAX_FM = 107.9; //Variable estatica para la frecuencia maxima de FM
    private int     MIN_AM = 530; //Variable estatica para la frecuencia minima de AM
    private int     MAX_AM = 1610; //Variable estatica para la frecuencia maxima de AM
    private double  MUL_FM = 0.20; //Multiplo para subir o bajar de la frecuencia FM
    private int     MUL_AM = 10; //Multiplo para subir o bajar de la frecuencia AM
//    private String  PATH_DATOS = "/Data/Sistema.xml";
    private double  frecuenciaActual = MAX_FM; //frecuencia con la que iniciara la radio
    private boolean emisoraActual = false; //iniciara con la emisora FM
    private ArrayList<Double> favoritosAM = 
            new ArrayList<Double>(
                    Arrays.asList(0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0));
    private ArrayList<Double> favoritosFM = 
            new ArrayList<Double>(
                    Arrays.asList(0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0));
    
    public void Controlador(){
        
    };
    
    @Override
    public boolean cambiarAmFm() {
        //retornamos la nueva frecuencia
        emisoraActual = !emisoraActual;
        if(emisoraActual){
            frecuenciaActual = MAX_AM;
        }
        else{
            frecuenciaActual = MAX_FM;
        }
        return emisoraActual;
    }

    @Override
    public void encendidoRadio() {
        throw new UnsupportedOperationException("Opción no soportada con este diseño."); 
    }

    @Override
    public double subirFrecuencia() {
        
        //Variable que contendra la nueva frecuencia
        double nuevaFrecuencia = 0.0;
        //String[] sintonizacion = getSintonizacionXML();
        
        //frecuenciaActual = Double.parseDouble(sintonizacion[0]);
        //emisoraActual = sintonizacion[1].equals("AM")?true : false;
        
        //Si la emisora es AM
        if(emisoraActual){
            nuevaFrecuencia = frecuenciaActual + MUL_AM;
            
            //Validamos si la frecuencia es mayor al maximo
            if(nuevaFrecuencia > MAX_AM){
                
                //si es mayor al maximo, colocamos la frecuencia minima
                nuevaFrecuencia = MIN_AM;
            }
        }
        //si la emisora es FM
        else{
            nuevaFrecuencia = frecuenciaActual + MUL_FM;
            
            //Validamos si la frecuencia es mayor al maximo
            if(nuevaFrecuencia > MAX_FM){
                
                //si es MAYOR al maximo, colocamos la frecuencia minima
                nuevaFrecuencia = MIN_FM;
            }
        }
        
        frecuenciaActual = nuevaFrecuencia;
        
        return nuevaFrecuencia;
    }

    @Override
    public double bajarFrecuencia() {
        
        //Variable que contendra la nueva frecuencia
        double nuevaFrecuencia = 0.0;
        
        //Si la emisora es AM
        if(emisoraActual){
            nuevaFrecuencia = frecuenciaActual - MUL_AM;
            
            //Validamos si la frecuencia es menor al minimo
            if(nuevaFrecuencia < MIN_AM){
                
                //si es menor al minimo, colocamos la frecuencia máxima
                nuevaFrecuencia = MAX_AM;
            }
        }
        //si la emisora es FM
        else{
            nuevaFrecuencia = frecuenciaActual - MUL_FM;
            
            //Validamos si la frecuencia es menor al minimo
            if(nuevaFrecuencia < MIN_FM){
                
                //si es menor al minimo, colocamos la frecuencia máxima
                nuevaFrecuencia = MAX_FM;
            }
        }
        frecuenciaActual = nuevaFrecuencia;
        
        return nuevaFrecuencia;
    }

    @Override
    public void setFavorito(int posicion) {
        
        if(emisoraActual){
            favoritosAM.set(posicion, frecuenciaActual);
        }
        else{
            favoritosFM.set(posicion, frecuenciaActual);
        }
    }

    @Override
    public double getFavorito(int posicion) {
        
        if(emisoraActual){
            return favoritosAM.get(posicion);
        }
        else{
            return favoritosFM.get(posicion);
        }
        
    }
    
}
