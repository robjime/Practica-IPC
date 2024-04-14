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
        vistaActual = new VistaMenuPrincipal();
        vistaActual.setVisible(true);
    }
    
    public void mostrarMisViajes(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaMisViajes();
        vistaActual.setVisible(true); 
    }
    
    public void mostrarRecargaTarjeta(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaRecargaTarjeta();
        vistaActual.setVisible(true);
    }
    
    public void mostrarMenuUsuario(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new MenuUsuario();
        vistaActual.setVisible(true);      
    }
    
    public void mostrarCompraBillete(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaCompraBillete();
        vistaActual.setVisible(true);
    }
    
    public void mostrarElegirViaje(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaElegirViaje();
        vistaActual.setVisible(true);
    }
  
    public void mostrarEditarViaje(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaEditarViaje();
        vistaActual.setVisible(true);
    }
    
    public void mostrarPagoBillete(){
        if(vistaActual != null){
            vistaActual.setVisible(false);
            vistaActual.dispose();
        }
        vistaActual = new VistaPagoBillete();
        vistaActual.setVisible(true);
    }
}
