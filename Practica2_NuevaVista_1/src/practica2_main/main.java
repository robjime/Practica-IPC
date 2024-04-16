/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2_main;

import practica2.modelo.ModeloRutas;
import practica2.vista.GestorVistas;

/**
 *
 * @author jorgy
 */
public class main {
    private static GestorVistas gestor;
    private static ModeloRutas modelo;
    
    public static void main(String args[]) {
        gestor = new GestorVistas();
        modelo = new ModeloRutas();
        gestor.mostrarMenuPrincipal();
        
    }
    
    public static GestorVistas getGestorVistas(){
        return gestor;
    }
}
