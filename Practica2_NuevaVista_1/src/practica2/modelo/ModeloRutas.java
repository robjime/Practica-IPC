/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ModeloRutas {

    private String estacionOrigen;
    private String estacionDestino;
    private ArrayList<String> estacionesOrigen;
    private ArrayList<String> estacionesDestino;
    private ArrayList<Ruta> rutas;

    public ModeloRutas() {
        estacionesOrigen = new ArrayList<>();
        estacionesDestino = new ArrayList<>();
        rutas = new ArrayList<>();
    }

    public void setEstacionOrigen(String estacionOrigen) {
        this.estacionOrigen = estacionOrigen;
    }

    public void setEstacionDestino(String estacionDestino) {
        this.estacionDestino = estacionDestino;
    }

    public String getEstacionOrigen() {
        return estacionOrigen;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }
    
    public void cargarEstacionesOrigenDesdeCSV(String rutaArchivo) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
        String linea;
        boolean primeraLinea = true; // Flag para indicar si es la primera línea
        while ((linea = reader.readLine()) != null) {
            if (primeraLinea) {
                primeraLinea = false; // Marcamos que ya hemos pasado la primera línea
                continue; // Saltamos la primera línea
            }
            estacionesOrigen.add(linea.trim());
        }
    }
    }

    public void cargarEstacionesDestinoDesdeCSV(String rutaArchivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            boolean primeraLinea = true; // Flag para indicar si es la primera línea
            while ((linea = reader.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false; // Marcamos que ya hemos pasado la primera línea
                    continue; // Saltamos la primera línea
                }
                estacionesDestino.add(linea.trim());
            }
        }
    }

     public ArrayList<String> getEstacionesOrigen() {
        return estacionesOrigen;
    }

    public ArrayList<String> getEstacionesDestino() {
        return estacionesDestino;
    }
    
    public void cargarRutas(String rutasDisponibles){
        try (BufferedReader reader = new BufferedReader(new FileReader(rutasDisponibles))) {
            String linea;
            // Saltamos la primera línea que contiene los encabezados
            reader.readLine();
            while ((linea = reader.readLine()) != null) {
                     String[] datos = linea.split(";");
                    // Crear una nueva ruta con los datos y agregarla a la lista de rutas
                    Ruta ruta = new Ruta(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
                    ruta.setidRuta(datos[0]);
                    ruta.setestacionOrigen(datos[1]);
                    ruta.setestacionDestino(datos[2]);
                    ruta.settiempo(datos[3]);
                    ruta.setprecio(datos[4]);
                    ruta.sethorarioSemana(datos[5]);
                    ruta.sethorarioFinSemana(datos[6]);
                    rutas.add(ruta);  //ArrayList con TODAS las rutas
            }
        }catch(IOException err){
           err.printStackTrace();
        }
    }
    public ArrayList<Ruta> getRutas() {
        return rutas; //devueve TODAS las rutas posibles
    }
}