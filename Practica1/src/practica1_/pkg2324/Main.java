/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1_.pkg2324;

import practica1_.pkg2324.modelo.Modelo;
import practica1_.pkg2324.vista.Controlador;
import practica1_.pkg2324.vista.Vista;

/**
 *
 * @author rober
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
        vista.setVisible(true);
    }
    
}

//HOLA PUTA