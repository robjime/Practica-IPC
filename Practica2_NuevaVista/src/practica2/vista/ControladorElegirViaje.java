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
public class ControladorElegirViaje {
    public VistaElegirViaje vista;
    
    public ControladorElegirViaje (VistaElegirViaje vista){
        this.vista = vista;
    }
    
    public void PasoAnterior(){
        main.getGestorVistas().mostrarCompraBillete();
    }
    public void PasoSiguiente(){
        main.getGestorVistas().mostrarPagoBillete();
    }
}
