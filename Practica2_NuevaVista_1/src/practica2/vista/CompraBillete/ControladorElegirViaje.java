/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.vista.CompraBillete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import practica2.modelo.ModeloRutas;
import practica2.modelo.Ruta;
import practica2.vista.GestorVistas;
import practica2_main.main;

/**
 *
 * @author jorgy
 */
public class ControladorElegirViaje {
    private GestorVistas gestor;
    private VistaElegirViaje vistaEV;
    private VistaCompraBillete vistaCB;
    private ModeloRutas modelo;
    private ArrayList<Ruta> rutasDisponibles;
    
    public ControladorElegirViaje (VistaElegirViaje vistaEV,VistaCompraBillete vistaCB, ModeloRutas modelo){
        this.vistaEV = vistaEV;
        this.modelo = modelo;
        this.vistaCB = vistaCB;
        this.rutasDisponibles = new ArrayList<>();
    }
    
    public void PasoAnterior(){
        main.getGestorVistas().mostrarCompraBillete();
    }
    public void PasoSiguiente(){
        main.getGestorVistas().mostrarPagoBillete();
    }
    
    public void inicializarRutas(String rutasDisponibles) {
        modelo.cargarRutas(rutasDisponibles);
        // Después de cargar las rutas en la lista, buscar las rutas disponibles según las estaciones
        buscarRutasDisponibles(); // Llama al método para filtrar las rutas disponibles
    }   

    public void buscarRutasDisponibles() {
    String estacionOrigen = vistaCB.getEstacionOrigen();
    String estacionDestino = vistaCB.getEstacionDestino();
    
    // Obtener la fecha seleccionada en el JCalendar
    Calendar fechaSeleccionada = vistaEV.getCalendar();
    int diaSemana = fechaSeleccionada.get(Calendar.DAY_OF_WEEK);

    // Filtrar las rutas disponibles según las estaciones y el día de la semana
    for (Ruta ruta : modelo.getRutas()) {
        if (ruta.getEstacionOrigen().equals(estacionOrigen) && ruta.getEstacionDestino().equals(estacionDestino)) {
            // Verificar si la ruta es válida para el día de la semana seleccionado
            if (diaSemana == Calendar.SATURDAY || diaSemana == Calendar.SUNDAY) {
                // Es fin de semana, agregar rutas para el fin de semana
                if (ruta.getHorarioFinSemana() != null && !ruta.getHorarioFinSemana().isEmpty()) {
                    rutasDisponibles.add(ruta);
                    System.out.println(ruta);
                }
            } else {
                // Es día de semana, agregar rutas para los días de semana
                if (ruta.getHorarioSemana() != null && !ruta.getHorarioSemana().isEmpty()) {
                    rutasDisponibles.add(ruta);
                    
                }
            }
        }
     // Verificar si la lista de rutas está vacía
    if (rutasDisponibles.isEmpty()) {
        // Si la lista está vacía, notificar a la vista para mostrar un mensaje de error
        vistaCB.mostrarEtiqueta_error();
    } else {
        // Si hay rutas disponibles, actualizar la vista con las rutas encontradas
        vistaEV.actualizarRutasDisponibles(rutasDisponibles);
      }
    }
    // Actualizar la vista con las rutas disponibles
        vistaEV.actualizarRutasDisponibles(rutasDisponibles);
    }  
}
