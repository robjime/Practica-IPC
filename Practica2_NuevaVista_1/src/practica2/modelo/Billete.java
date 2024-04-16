/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author jorgy
 */
public class Billete {
    private String id;
    private LocalDate fecha;
    private String estacionOrigen;
    private String estacionDestino;
    private int tiempo;
    private double precio;
    private LocalTime hora;
    private boolean mascota;
    private boolean bicicleta;
    private int saldo;
    
    public Billete(String id, LocalDate fecha, String estacionOrigen, String estacionDestino, 
                   int tiempo, double precio, LocalTime hora, boolean mascota, boolean bicicleta, int saldo){
        
        this.id = id;
        this.fecha = fecha;
        this.estacionOrigen = estacionOrigen;
        this.estacionDestino = estacionDestino;
        this.tiempo = tiempo;
        this.precio = precio;
        this.hora = hora;
        this.mascota = mascota;
        this.bicicleta = bicicleta;
        this.saldo = saldo;
    }
}