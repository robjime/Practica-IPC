/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.vista;

import practica2_nuevavista.main;

/**
 *
 * @author jorgy
 */
public class ControladorRecargaTarjeta {
    private GestorVistas gestor;
    private VistaRecargaTarjeta2 vista;
    
    public ControladorRecargaTarjeta (VistaRecargaTarjeta2 vista){
        this.vista = vista;
    }
    
    public void vistaAnterior(){ //acción para el botón volver al paso anterior
        main.getGestorVistas().mostrarMenuUsuario();
    }
    
    public void volverMenuPrincipal(){ //acción para volver al menú principal
        main.getGestorVistas().mostrarMenuPrincipal();
    }
}
