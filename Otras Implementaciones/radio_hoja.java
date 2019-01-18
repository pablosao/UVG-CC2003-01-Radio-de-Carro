/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrea y Alexis
 */
public class radio_hoja implements Radio
{
  private boolean onOff;
  private boolean amfm;
  private double frecAM;
  private double frecFM;
  private double[] guardadas = new double[12];
  private double e;
  
  public radio_hoja()
  {
    amfm = true;
    onOff = false;
    frecFM = 87.9;
    frecAM = 530.0;
  }
  


  @Override
  public boolean encendidoRadio()
  {
    if (onOff) {
      onOff = false;
      return false;
    }
    onOff = true;
    return true;
  }
  



  @Override
  public boolean cambiarAmFm()
  {
    if (!amfm) {
      amfm = true;
      
      return amfm;
    }
    amfm = false;
    
    return amfm;
  }
  

  @Override
  public double subirFrecuencia()
  {
    if (!amfm) {
      if (frecAM >= 1610.0) {
        frecAM = 530.0;
        
        return frecAM;
      }
      
      return this.frecAM += 10.0;
    }
    


    if (frecFM >= 107.9) {
      frecFM = 87.9;
      
      return frecFM;
    }
    

    return this.frecFM += 0.2;
  }
  


  @Override
  public double bajarFrecuencia()
  {
    if (!amfm) {
      if (frecAM <= 530.0D) {
        frecAM = 1610.0D;
        
        return frecAM;
      }
      
      return this.frecAM -= 10.0;
    }
    


    if (frecFM <= 87.9) {
      frecFM = 107.9;
      
      return frecFM;
    }
    

    return this.frecFM -= 0.2;
  }
  



  @Override
  public double getFavorito(int posicion)
  {
    double estacion = 0.0;
    int espacio = posicion - 1;
    estacion = guardadas[espacio];
    if (estacion == 0.0)
    {
      if (amfm)
      {
        estacion = 87.9;
      } else {
        estacion = 530.0;
      }
    }
    return estacion;
  }

    @Override
    public void setFavorito(int posicion) {
       if (amfm == true) {
      guardadas[(posicion - 1)] = frecFM;
    } else {
      guardadas[(posicion - 1)] = frecAM;
    } 
    }

  
}
