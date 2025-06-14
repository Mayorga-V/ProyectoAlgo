/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoalgo;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author mayorga
 */
public class Tree {

    private File dataFile;

    public Tree(File dataFile) throws IOException {
        this.dataFile = dataFile;
        generateTree();
    }

    private void generateTree() throws IOException {
        Department[] treeData = FileUtil.loadFromFile(dataFile);
        Department[] copy = treeData;
        Quicksort.order(copy);
        Node root = new Node(copy[0]);
        for (Department department : treeData) {
            
        }
    }
    
}
