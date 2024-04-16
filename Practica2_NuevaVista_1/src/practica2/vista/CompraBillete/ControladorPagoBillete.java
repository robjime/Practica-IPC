/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.vista.CompraBillete;

import practica2.vista.GestorVistas;
import practica2_main.main;

/**
 *
 * @author jorgy
 */
public class ControladorPagoBillete {
    private GestorVistas gestor;
    private VistaPagoBillete vista;
    
    public ControladorPagoBillete(VistaPagoBillete vista){
        this.vista = vista;
    }
   
    public void pasoAnterior(){
        main.getGestorVistas().mostrarElegirViaje();
    }
    
    public void volverMenuPrincipal(char[] PIN){
        String pin = String.valueOf(PIN);
        if(pin.equals("1234")){ //vuelve al menú principal y ejecuta el pago si la contraseña es correcta
            main.getGestorVistas().mostrarMenuPrincipal();
        }
    }
    public void irMenuPrincipal(){
        main.getGestorVistas().mostrarMenuPrincipal();
    }
}
