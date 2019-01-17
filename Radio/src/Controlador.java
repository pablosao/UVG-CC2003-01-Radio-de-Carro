/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    private boolean emisoraSelecionada; //emisora que esta seleccionada por el usuario
    private double  frecuenciaSelecionada; //frecuencia que esta escuchando el usuario
    
    
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
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double bajarFrecuencia() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void setFavorito(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double getFavorito(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    /**
     * Metodo para identificar la emmisora que esta escuchando el usuario
     * @param emisora emisora que esta escuchando el usuario
     */
    public void setEmisora(boolean emisora){
        emisoraSelecionada = emisora;
    }
    
    /**
     * Metodo para identificar la frecuencia que se encuentra reproduciendo actualmente en la radio
     * @param frecuencia frecuencia que se esta reproduciendo por el usuario
     */
    public void setFrecuencia(double frecuencia){
        frecuenciaSelecionada = frecuencia;
    }
}
