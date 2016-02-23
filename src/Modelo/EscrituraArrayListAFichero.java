/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author Alejandroo
 */
public class EscrituraArrayListAFichero {
    public static void main (String[] args) throws IOException {
        ArrayList datos = new ArrayList();
        
        File f = new File("C:\\Users\\Alejandroo\\Documents\\NetBeansProjects\\Practica8\\src\\Modelo\\FicheroDatos.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        
        String dato1 = "Alejandro";
        String dato2 = "Miguel";
        String dato3 = "Luis";
        String dato4 = "Joaquin";
        
        datos.add(dato1);
        datos.add(dato2);
        datos.add(dato3);
        datos.add(dato4);
        
        for(int i=0;i<datos.size();i++) {
            bw.write((String) datos.get(i));
            bw.write('\t');
           
        }
        
        bw.close();
        fw.close();
    }
}
