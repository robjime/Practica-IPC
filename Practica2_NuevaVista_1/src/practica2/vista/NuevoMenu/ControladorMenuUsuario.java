/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.vista.NuevoMenu;

import practica2.vista.GestorVistas;
import practica2_main.main;

/**
 *
 * @author jorgy
 */
public class ControladorMenuUsuario {
    private GestorVistas gestor;
    private MenuUsuario vista;
    
    public ControladorMenuUsuario(MenuUsuario vista){
        this.vista = vista;
    }
    
    public void volverMenuPrincipal(){ //muestra la vista del menú principal
       main.getGestorVistas().mostrarMenuPrincipal();
    }
    
    public void mostrarMisViajes(){ //muestra la vista de Mis Viajes
        main.getGestorVistas().mostrarMisViajes();
    }
    
    public void mostrarRecargaTarjeta(){ //muestra la vista de RecargarTarjeta
        main.getGestorVistas().mostrarRecargaTarjeta();
    }
}
