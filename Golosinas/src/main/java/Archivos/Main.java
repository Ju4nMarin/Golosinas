/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import javax.swing.JOptionPane;

/**
 *
 * @author JUAN MARIN
 */
public class Main {
   
    public static void main(String args[]){
        metodos miData=null;
        int vend, mes, pos;
        
        int op;
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Menú Principal \n"+
            "1. Crear y cargar matriz de ventas. \n"+
            "2. Mostrar ventas. \n"+
            "3. Mostrar ventas de un vendedor. \n"+
            "4. Mostrar ventas de un mes. \n"+
            "5. Determinar el mejor vendedor del año. \n"+
            "6. Determinar el mejor mes de ventas. \n"+        
            "7. Salir. \n"+
            "Entre su opción: ?"        
            ));
            
            switch(op){
                
                    }
                break;
                case 7:                    
                    JOptionPane.showMessageDialog(null, 
                    "Adios!!!");
                break;
                default:
                    JOptionPane.showMessageDialog(null, 
                    "Error!: Opción invalida, intente"
                    + " nuevamente.");                                    
            }
            
        }while(op!=7);
        
        System.exit(0);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
