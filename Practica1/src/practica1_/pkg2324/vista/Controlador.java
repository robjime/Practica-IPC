/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_.pkg2324.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import practica1_.pkg2324.modelo.Modelo;

/**
 *
 * @author rober
 */
public class Controlador {
    private final Vista vista;
    private final Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        vista.getBotonIntercambiar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intercambiarEstaciones();
            }
        });
        
    }

    private void intercambiarEstaciones() {
        String estacionOrigen = vista.getEstacionOrigen();
        String estacionDestino = vista.getEstacionDestino();

        // Intercambia las estaciones en el modelo
        modelo.setEstacionOrigen(estacionDestino);
        modelo.setEstacionDestino(estacionOrigen); 
    }
    
    /*
    public void guardarFecha(){
        JCalendar jCalendar = vista.getJCalendar();
        Date fechaseleccionada = jCalendar.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fecha_formateada = formato.format(fechaseleccionada);
        modelo.setFecha(fecha_formateada);   
    }
    
    public void siguientePaso() {
        modelo.setEstacionOrigen(vista.getEstacionOrigen());
        modelo.setEstacionDestino(vista.getEstacionDestino());
        // Lógica para determinar y establecer la fecha de salida
        SimpleDateFormat formato_1 = new SimpleDateFormat("dd-MM-yy");
        modelo.setFecha(formato_1.format(vista.getFecha()));
        
    }
    */
}
