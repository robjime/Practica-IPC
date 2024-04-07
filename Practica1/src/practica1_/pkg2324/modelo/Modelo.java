/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_.pkg2324.modelo;

import java.util.Date;

/**
 *
 * @author rober
 */
public class Modelo {
    private String EstacionOrigen;
    private String EstacionDestino;
    private Date selectedDate;

    public String getEstacionOrigen() {
        return EstacionOrigen;
    }

    public void setEstacionOrigen(String EstacionOrigen) {
        this.EstacionOrigen = EstacionOrigen;
    }

    public String getEstacionDestino() {
        return EstacionDestino;
    }

    public void setEstacionDestino(String EstacionDestino) {
        this.EstacionDestino = EstacionDestino;
    }

    public Date getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(Date selectedDate) {
        this.selectedDate = selectedDate;
    }
}