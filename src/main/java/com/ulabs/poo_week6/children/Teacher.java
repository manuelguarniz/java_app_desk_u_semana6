/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_week6.children;

import com.ulabs.poo_week6.parents.Person;

/**
 *
 * @author manuelguarniz
 */
public class Teacher extends Person {
    private int hourWorked;
    private double fee;

    public Teacher(String firstname, String lastname, int age, int hourWorked, double fee) {
        super(firstname, lastname, age);
        this.hourWorked = hourWorked;
        this.fee = fee;
    }
    
    private Double calculateSalary() {
        return hourWorked * fee;
    }

    @Override
    public String showInformation() {
        String salary = String.format("%.2f", calculateSalary());
        return super.showInformation()
                + "\n- Tarifa: " + fee
                + "\n- Horas trabajadas: " + hourWorked
                + "\n- Sueldo: S/. " + salary;
    }
    
    
}
