import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.SAXException;


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
    
    private double  MIN_FM = 87.9; //Variable estatica para la frecuencia minima de FM
    private double  MAX_FM = 107.9; //Variable estatica para la frecuencia maxima de FM
    private int     MIN_AM = 530; //Variable estatica para la frecuencia minima de AM
    private int     MAX_AM = 1610; //Variable estatica para la frecuencia maxima de AM
    private double  MUL_FM = 0.2; //Multiplo para subir o bajar de la frecuencia FM
    private int     MUL_AM = 10; //Multiplo para subir o bajar de la frecuencia AM
    private String  PATH_DATOS = "Sistema.xml";
    private double  frecuenciaActual = MAX_FM; //frecuencia con la que iniciara la radio
    private boolean emisoraActual = false; //iniciara con la emisora fm
    
    public void Controlador(){
        
    };
    
    @Override
    public boolean cambiarAmFm() {
        //retornamos la nueva frecuencia
        return !this.emisoraActual;
    }

    @Override
    public void encendidoRadio() {
        throw new UnsupportedOperationException("Opción no soportada con este diseño."); 
    }

    @Override
    public double subirFrecuencia() {
        
        //Variable que contendra la nueva frecuencia
        double nuevaFrecuencia = 0.0;
        String[] sintonizacion = getSintonizacionXML();
        
        frecuenciaActual = Double.parseDouble(sintonizacion[0]);
        emisoraActual = sintonizacion[1].equals("AM")?true : false;
        
        //Si la emisora es AM
        if(emisoraActual){
            nuevaFrecuencia = (int)(frecuenciaActual + MUL_AM);
            
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
        
        return nuevaFrecuencia;
    }

    @Override
    public double bajarFrecuencia() {
        
        //Variable que contendra la nueva frecuencia
        double nuevaFrecuencia = 0.0;
        
        //Si la emisora es AM
        if(emisoraActual){
            nuevaFrecuencia = (int)(frecuenciaActual - MUL_AM);
            
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
    
    private String[] getSintonizacionXML(){
        
        String frecuencia = "";
        String emisora  = "";

        //Get Document Builder
        try{
            
            String path = PATH_DATOS;
            System.out.println(PATH_DATOS);
        
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File(PATH_DATOS));
            document.getDocumentElement().normalize();
            
            
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//
//            //Build Document
//            Document document = builder.parse(PATH_DATOS);
//
//            //Normalize the XML Structure; It's just too important !!
//            document.getDocumentElement().normalize();

            //Here comes the root node
            Element root = document.getDocumentElement();
            System.out.println(root.getNodeName());

            //Get all employees
            NodeList nList = document.getElementsByTagName("frecuencia");
            
            Node node = nList.item(0);
            System.out.println("");    //Just a separator
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                //Obtenemos el elemento del nodo a partir del atributo del XML
                Element eElement = (Element) node;
                frecuencia = eElement.getElementsByTagName("seleccionada").item(0).getTextContent();
                System.out.println(frecuencia);
                emisora = eElement.getElementsByTagName("emisora").item(0).getTextContent();
                System.out.println(emisora);
            }
            
            

//            for (int temp = 0; temp < nList.getLength(); temp++)
//            {
//                     Node node = nList.item(temp);
//                     System.out.println("");    //Just a separator
//                     if (node.getNodeType() == Node.ELEMENT_NODE)
//                     {
//                            //Print each employee's detail
//                            Element eElement = (Element) node;
//                            System.out.println("Employee id : "    + eElement.getAttribute("id"));
//                            System.out.println("First Name : "  + eElement.getElementsByTagName("firstName").item(0).getTextContent());
//                            System.out.println("Last Name : "   + eElement.getElementsByTagName("lastName").item(0).getTextContent());
//                            System.out.println("Location : "    + eElement.getElementsByTagName("location").item(0).getTextContent());
//                     }
//            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
        
        return new String[]{frecuencia,emisora};
    }
}
