/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlrio;

import com.mycompany.controlrio.*;
import javax.swing.JOptionPane;


/**
 *
 * @author jose_
 */
public class main {
    public static void main(String[] args) {
        
        Bienvenida welcome= new Bienvenida();
       welcome.dispose();
        System.out.println("Programa Iniciado......");
        
        System.out.println("Ingresa el valor del Agua mas cercano :\n" +
"|    [1]  |     [2]     |    [3]     |   [4]   |\n"+
"________________________________________________\n"+
"|Dulce    |Salobre      |   Mar      |Salmuera |\n" +
"|< 0,05 % | 0,05 – 3%   | 3 – 5 %    |> 5 %    |\n" +
"|< 0,5 g/L| 0,5 – 30 g/L| 30 – 50 g/L|> 50 g/L |\n"+
"________________________________________________\n\n"+
"\t¿Elije El nivel De Salinidad?");
        
        JOptionPane.showMessageDialog(welcome, "El Programa Se Ha Iniciado...");
        welcome.setVisible(true);
        welcome.setResizable(false);
        welcome.setLocationRelativeTo(welcome);
        
        
        
    }
    
}
