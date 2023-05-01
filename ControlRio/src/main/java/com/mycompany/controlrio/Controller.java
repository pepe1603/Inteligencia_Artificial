/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlrio;

import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class Controller {
   public String menu="Ingresa el valor del Agua mas cercano :\n" +
"|    [1]     |      [2]     |      [3]     |      [4]   |\n"+
"_____________________________________\n"+
"|Dulce    |Salobre      |   Mar      |Salmuera |\n" +
"|< 0,05 % | 0,05 – 3%   | 3 – 5 %    |> 5 %    |\n" +
"|< 0,5 g/L| 0,5 – 30 g/L| 30 – 50 g/L|> 50 g/L |\n"+
"_____________________________________\n\n"+
"\t¿Elije El nivel De Salinidad?";
    
    
    int data;
    public void RecopilarDatos(){
        int ValorSensor=0;
        //retornar datos
        System.out.println("Recopilando Datos..   ");
       /* data = Integer.parseInt( JOptionPane.showInputDialog(null, "Ingresa el valor del Agua mas cercano :\n" +
"   [1]             [2]             [3]             [4]   \n "+
"Dulce\t	--Salobre\t	--Mar\t	--Salmuera\n" +
"< 0,05 % \t	--0,05 – 3 % \t	--3 – 5 %          -- > 5 %\n" +
"< 0,5 g/L \t	--0,5 – 30 g/L \t	--30 – 50 g/L \t	-- > 50 g/L  \n\n"+
                "¿Elije El nivel De Salinidad?"));
        
        */
       data = Integer.parseInt( JOptionPane.showInputDialog(null,menu));
        
       int reply = JOptionPane.showConfirmDialog(null, "Continuar para indentificar el punto de cambio del agua?","¿Continuamos?",JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
        identificar_punto_cambio(data);
        }else{
            
            RecopilarDatos();
        }
    }
    
    public String mensaje="No se Ha encontrado Registro";
    public float valorcambio=0;
        
    public void identificar_punto_cambio(int valorSalinidad){
        
    
        //retornar puntyo de cambio del agua
//nivel de salinidad del agua
        
        switch(valorSalinidad){
            case 1: 
                    valorcambio = (float) 0.05;
                     mensaje="El Agua Lista para Consumo";
                    

 
                break;
            case 2:
                valorcambio = (float) 0.3;
                mensaje="El Agua No es Apta para Consumo";
                activar_senal_alerta();

                
                break;
            case 3:
                valorcambio = (float) 0.5;
                mensaje="El Agua No es Apta para Consumo";
                activar_senal_alerta();
                break;
            case 4: 
                valorcambio = (float) 0.6;
                mensaje="El Agua No es Apta para Consumo";
                activar_senal_alerta();
                break;
            default:JOptionPane.showMessageDialog(null, "Valor Incorrecto");
        }
        
        
        
        
    }
    
    public void activar_senal_alerta(){
        
        String alert;
        
        JOptionPane.showMessageDialog(null, "El Agua No Es consumible, favor de Contactarnos , Enviandonos un informe.");
        
    }
    
    public void EnviarDatos(String data_send){
        String cadena_send = data_send;
        String coreo = JOptionPane.showInputDialog("Escribe tu correo_");
        
        JOptionPane.showMessageDialog(null, "Destinatario: "+coreo+"\n------ Se Envio el Reporte ------\n"+cadena_send);
        
    }
    
    public void evaluar_resultados(){
        JOptionPane.showMessageDialog(null, "\t\t!!!! FELICIDADES ¡¡¡\nEl agua se esta suminstrando a las Viviendas y Todas las Alertas se han Desactivado");
    }
    
    
}
