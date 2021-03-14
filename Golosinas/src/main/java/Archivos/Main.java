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
            "1. Pedir golosina. \n"+
            "2. Mostrar golosinas. \n"+
            "3. Rellenar golosinas. \n"+
            "4. Estadisticas. \n"+
            "5. Salir. \n"+
            "Digite una opción: "        
            ));
            
            switch(op){
                case 1:
                    
                    
                break;
                case 2:
                 break; 
                case 3:
                 break;
                case 4:
                 break;   
                case 5:                    
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
