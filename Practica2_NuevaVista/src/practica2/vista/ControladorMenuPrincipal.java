package practica2.vista;

import practica2.modelo.Modelo;
import practica2_nuevavista.main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorgy
 */
public class ControladorMenuPrincipal {
    private Modelo modelo;
    private GestorVistas gestor;
    private VistaMenuPrincipal2 vista;
    
    public ControladorMenuPrincipal(VistaMenuPrincipal2 vista){
        this.vista = vista;
    }
    
    public void mostrarMenuUsuario(){
        main.getGestorVistas().mostrarMenuUsuario();  
    }
    
    public void comprarBillete(){
        main.getGestorVistas().mostrarMenuUsuario();
    }
}
