/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoalgo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author mayorga
 */
public class FileUtil {
    public static File chooseFile(){
        JFileChooser choose = new JFileChooser();
        choose.setDialogTitle("Seleccione un archivo a cargar");
        int res = choose.showOpenDialog(null);
        if (res != 0) {
            return null;
        }
        File file  = choose.getSelectedFile();
        return file;
    }
    
    public static Department[] loadFromFile(File file) throws IOException{
        
        ArrayList<Department> list = new ArrayList();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            
            while((line = br.readLine()) != null){
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    try{
                        int code = Integer.parseInt(parts[0].trim());
                        String name = parts[1].trim();
                        int fatherCode = Integer.parseInt(parts[2].trim());
                        int employee = Integer.parseInt(parts[3].trim());
                        int budget = Integer.parseInt(parts[4].trim());
                        list.add(new Department(code, name, fatherCode, employee, budget));
                    } catch (NumberFormatException e){
                        System.err.println("Error at line" + line);
                    }
                }
            }
            
        }
        return list.toArray(new Department[0]);
        
    }
}
