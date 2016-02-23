/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alejandroo
 */
public class PruebaArrayList {
    public static void main (String[] args) throws FileNotFoundException, IOException {
        
        File f = new File("C:\\Users\\Alejandroo\\Documents\\NetBeansProjects\\Practica8\\src\\Modelo\\fichero.txt");
        if(!f.exists()) {
            f.createNewFile();
        }
        /**
         * Codigo necesario para leer y pasar los datos a un arraylist
         */
        
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        ArrayList al = new ArrayList();
       
        String cad = br.readLine();
        
        while(cad != null){
            al.add(cad);
            cad = br.readLine();
            
        }
        br.close();
        for(int i=0;i<al.size();i++) {
            System.out.println(al.get(i));
        }
        
        
        
       
        
        
        
        
    }
}
