/*
 * Modifico: Pablo Sao
 * Fecha: 16/01/2019
¨* Descripción: Se empieza a agregarle logica al programa, con el requerimiento del cambio de frecuencias
 */

/**
 * Controlador de los eventos de la radio implementando la interfaz iRadio
 * @author pablo
 * @version 1.0
 */
public class Controlador implements iRadio{
    
    private double  MIN_FM = 87.9; //Variable estatica para la frecuencia minima de FM
    private double  MAX_FM = 107.9; //Variable estatica para la frecuencia maxima de FM
    private int     MIN_AM = 530; //Variable estatica para la frecuencia minima de AM
    private int     MAX_AM = 1610; //Variable estatica para la frecuencia maxima de AM
    private double  MUL_FM = 0.2; //Multiplo para subir o bajar de la frecuencia FM
    private int     MUL_AM = 10; //Multiplo para subir o bajar de la frecuencia AM
    
    
    @Override
    public boolean cambiarAmFm() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void encendidoRadio() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double subirFrecuencia() {
        
        //Variable que contendra la nueva frecuencia
        double nuevaFrecuencia = 0.0;
        
        //Si la emisora es AM
        if(cambiarAmFm()){
            //nuevaFrecuencia = frecuenciaSelecionada + MUL_AM;
            
            //Validamos si la frecuencia es mayor al maximo
            if(nuevaFrecuencia > MAX_AM){
                
                //si es mayor al maximo, colocamos la frecuencia minima
                nuevaFrecuencia = MIN_AM;
            }
        }
        //si la emisora es FM
        else{
            //nuevaFrecuencia = frecuenciaSelecionada + MUL_FM;
            
            //Validamos si la frecuencia es mayor al maximo
            if(nuevaFrecuencia > MAX_FM){
                
                //si es MAYOR al maximo, colocamos la frecuencia minima
                nuevaFrecuencia = MIN_FM;
            }
        }
        
        return nuevaFrecuencia;
    }

    @Override
    public double bajarFrecuencia() {
        
        //Variable que contendra la nueva frecuencia
        double nuevaFrecuencia = 0.0;
        
        //Si la emisora es AM
        if(cambiarAmFm()){
            //nuevaFrecuencia = frecuenciaSelecionada - MUL_AM;
            
            //Validamos si la frecuencia es menor al minimo
            if(nuevaFrecuencia < MIN_AM){
                
                //si es menor al minimo, colocamos la frecuencia máxima
                nuevaFrecuencia = MAX_AM;
            }
        }
        //si la emisora es FM
        else{
            //nuevaFrecuencia = frecuenciaSelecionada - MUL_FM;
            
            //Validamos si la frecuencia es menor al minimo
            if(nuevaFrecuencia < MIN_FM){
                
                //si es menor al minimo, colocamos la frecuencia máxima
                nuevaFrecuencia = MAX_FM;
            }
        }
        
        return nuevaFrecuencia;
    }

    @Override
    public void setFavorito(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double getFavorito(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
