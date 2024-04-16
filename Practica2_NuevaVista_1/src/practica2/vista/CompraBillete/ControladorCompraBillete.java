/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.vista.CompraBillete;

import java.io.IOException;
import practica2.modelo.ModeloRutas;
import practica2.vista.GestorVistas;
import practica2_main.main;


/**
 *
 * @author jorgy
 */
public class ControladorCompraBillete {
    public GestorVistas gestor;
    public VistaCompraBillete vistaCB;
    public ModeloRutas modelo;
    
    public ControladorCompraBillete(VistaCompraBillete vistaCB, ModeloRutas m){
        this.vistaCB = vistaCB;
        this.modelo = m;
    }
    
    
    public void PasoAnterior(){
        main.getGestorVistas().mostrarMenuPrincipal();
    }
    
    public void PasoSiguiente(){
        String estacionOrigen = vistaCB.getEstacionOrigen();
        String estacionDestino = vistaCB.getEstacionDestino();

        // Verificar si las estaciones son iguales
        boolean iguales = estacionOrigen.equals(estacionDestino);

        if (!iguales) { 
            // vistaEV.ListaRutasDisponibles();
            main.getGestorVistas().mostrarElegirViaje();
        
        } else {
            // Si las estaciones son iguales, reestablecer los campos de estaciones por defecto
            vistaCB.reestablecerEstaciones();
            vistaCB.mostrarEtiqueta_error();
        }
        
    }
    public void IntercambiarEstaciones() {
        String estacionOrigen = vistaCB.getEstacionOrigen();
        String estacionDestino = vistaCB.getEstacionDestino();

        // Intercambia las estaciones en el modelo
        modelo.setEstacionOrigen(estacionDestino);
        modelo.setEstacionDestino(estacionOrigen);  // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        // Actualiza los JComboBox en la vista
        this.vistaCB.actualizarEstaciones(modelo.getEstacionOrigen(), modelo.getEstacionDestino());
    }
    
    public void inicializar(String rutaArchivo) {
        try {
            modelo.cargarEstacionesOrigenDesdeCSV("src\\practica2\\vista/estaciones.csv");
            modelo.cargarEstacionesDestinoDesdeCSV("src\\practica2\\vista/estaciones.csv");
            vistaCB.cargarEstaciones();
        } catch (IOException e) {
            // Manejar la excepción de alguna manera, por ejemplo, mostrar un mensaje de error
            e.printStackTrace();
        }
    }
}
