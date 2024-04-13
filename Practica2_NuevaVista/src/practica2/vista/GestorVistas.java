/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.vista;

import javax.swing.JFrame;

/**
 *
 * @author jorgy
 */
public class GestorVistas {
    private JFrame vistaActual;
    
    public void mostrarMenuPrincipal(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaMenuPrincipal2();
        vistaActual.setVisible(true);
    }
    
    public void mostrarMisViajes(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaMisViajes2();
        vistaActual.setVisible(true);
        
    }
    
    public void mostrarRecargaTarjeta(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaRecargaTarjeta2();
        vistaActual.setVisible(true);
       
    }
    
    public void mostrarMenuUsuario(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new MenuUsuario2();
        vistaActual.setVisible(true);
        
    }
}
