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
public class ControladorEditarViaje {
    private GestorVistas gestor;
    public VistaEditarViaje vista;
    
    
    public ControladorEditarViaje (VistaEditarViaje vista){
        this.vista = vista;
    }
    public void Volver(){
        main.getGestorVistas().mostrarMisViajes();
    }
    
     public void PasoSiguiente(){ //aquí hay que cargar todos los datos que se modifican al editar el billete
        main.getGestorVistas().mostrarMisViajes();
     }
    
}
