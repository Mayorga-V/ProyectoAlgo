/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoalgo;

/**
 *
 * @author mayorga
 */
public class Department implements Comparable<Department>{

    private int code;
    private String name;
    private int fatherCode;
    private int employeAmm;
    private int budget;

    public Department(int code, String name, int fatherCode, int employeAmm, int budget) {
        this.code = code;
        this.name = name;
        this.fatherCode = fatherCode;
        this.employeAmm = employeAmm;
        this.budget = budget;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFatherCode() {
        return fatherCode;
    }

    public void setFatherCode(int fatherCode) {
        this.fatherCode = fatherCode;
    }

    public int getEmployeAmm() {
        return employeAmm;
    }

    public void setEmployeAmm(int employeAmm) {
        this.employeAmm = employeAmm;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public int compareTo(Department t) {
        return Integer.compare(code, t.getCode());
    }
    
    
    
}
