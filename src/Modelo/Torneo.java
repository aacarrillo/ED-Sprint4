/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Alejandroo
 */
public class Torneo implements Serializable{
    private String nombre;
    private int puntuacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Torneo(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }
    
    public Torneo() {
        
    }
    
    public static ArrayList<Torneo> cargar(File fichero) throws FileNotFoundException, IOException {
        ArrayList arl = new ArrayList();
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);
        
        String cad = br.readLine();
        while(cad != null) {
           arl.add(br);
           br.readLine();
           
        }
        br.close();
        
        return arl;
    }
    
    public static boolean guardar(ArrayList<Torneo> lista,File fichero) throws IOException {
        FileWriter fw = new FileWriter(fichero);
        BufferedWriter bw = new BufferedWriter(fw);
        
    }
    
   
}
