/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author jorgy
 */
public class ModeloUsuario {
    
    private ArrayList<Billete> billetes; //ArrayList de 
    
    public ModeloUsuario(){
        billetes = new ArrayList<>();
    }
    
    public void cargardatosUsuario(String rutaFichero){ //lee el fichero de los billetes
        try(BufferedReader reader = new BufferedReader(new FileReader(rutaFichero))){
            String linea;
            boolean primeraLinea = true;
            while((linea = reader.readLine()) != null){
                if(primeraLinea){
                    primeraLinea = false;
                    continue;
                }
            }
        }catch(IOException error){
            error.printStackTrace();
        }
    }
}
