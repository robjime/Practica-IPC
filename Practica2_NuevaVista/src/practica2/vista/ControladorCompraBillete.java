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
public class ControladorCompraBillete {
    public GestorVistas gestor;
    public VistaCompraBillete vista;
    
    public ControladorCompraBillete(VistaCompraBillete vista){
        this.vista = vista;
    }
    public void PasoAnterior(){
        main.getGestorVistas().mostrarMenuPrincipal();
    }
    
    public void PasoSiguiente(){
        main.getGestorVistas().mostrarElegirViaje();
    }
}
