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
public class ControladorRecargaTarjeta {
    private GestorVistas gestor;
    private VistaRecargaTarjeta vista;
    
    public ControladorRecargaTarjeta (VistaRecargaTarjeta vista){
        this.vista = vista;
    }
    
    public void vistaAnterior(){ //acción para el botón volver al paso anterior
        main.getGestorVistas().mostrarMenuUsuario();
    }
    
    public void volverMenuPrincipal(){ //acción para volver al menú principal
        main.getGestorVistas().mostrarMenuPrincipal();
    }
    
    public void ComprobarPassword(char [] contraseña){ //funcion para comprobar si la contraseña introducida es la correcta
        String str_contraseña = String.valueOf(contraseña);
        if(str_contraseña.equals("1234")){
            main.getGestorVistas().mostrarMenuPrincipal();
        }
    }
    
    
}
