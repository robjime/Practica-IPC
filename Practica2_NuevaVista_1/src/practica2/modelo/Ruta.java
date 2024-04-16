/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.modelo;

/**
 *
 * @author rober
 */
public class Ruta {
    private String idRuta;
    private String estacionOrigen;
    private String estacionDestino;
    private String tiempo;
    private String precio;
    private String horarioSemana;
    private String horarioFinSemana;

    public Ruta(String idRuta, String estacionOrigen, String estacionDestino, String tiempo, String precio, String horarioSemana, String horarioFinSemana){
        setidRuta(idRuta);
        setestacionOrigen(estacionOrigen);
        setestacionDestino(estacionDestino);
        settiempo(tiempo);
        setprecio(precio);
        sethorarioSemana(horarioSemana);
        sethorarioFinSemana(horarioFinSemana);
    }

    public String getidRuta(){
        return idRuta;
    }

    void setidRuta(String idRuta) {
        this.idRuta = idRuta;
        
    }
    
    public String getEstacionOrigen() {
        return estacionOrigen;
    }
        
    void setestacionOrigen(String estacionOrigen) {
        this.estacionOrigen = estacionOrigen;
        
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }
        
    void setestacionDestino(String estacionDestino) {
        this.estacionDestino = estacionDestino;
        
    }

     public String getTiempo() {
        return tiempo;
    }
    
    void settiempo(String tiempo) {
        this.tiempo = tiempo;
        
    }

    public String getPrecio() {
        return precio;
    }
    
    void setprecio(String precio) {
        this.precio = precio;
        
    }

    public String getHorarioSemana() {
        return horarioSemana;
    }
    
    void sethorarioSemana(String horarioSemana) {
        this.horarioSemana = horarioSemana;
        
    }

     public String getHorarioFinSemana() {
        return horarioFinSemana;
    }
    
    void sethorarioFinSemana(String horarioFinSemana) {
        this.horarioFinSemana = horarioFinSemana;
        
    }

    
}
