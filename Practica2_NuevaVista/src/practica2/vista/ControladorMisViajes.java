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
public class ControladorMisViajes {
    private VistaMisViajes vistaV;
    private GestorVistas gestor;
    
    public ControladorMisViajes(VistaMisViajes vistaV){
        this.vistaV = vistaV;
    }
    
    public void VolverMenuPrincipal(){
        main.getGestorVistas().mostrarMenuPrincipal();
    }
    
    public void VolverMenuUsuario(){
        main.getGestorVistas().mostrarMenuUsuario();
    }
    
    public void mostrarEditarViaje(){
        main.getGestorVistas().mostrarEditarViaje();
    }
}
