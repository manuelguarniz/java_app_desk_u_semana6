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
public class Student extends Person {
    private double note1;
    private double note2;
    private double note3;

    public Student(String firstname, String lastname, int age, double note1, double note2, double note3) {
        super(firstname, lastname, age);
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }
    
    private double averageNotes() {
        return (note1 + note2 + note3) / 3;
    }

    @Override
    public String showInformation() {
        String averageNote = String.format("%.2f", averageNotes());
        return super.showInformation()
                + "\n- Nota1: " + note1
                + "\n- Nota2: " + note2
                + "\n- Nota3: " + note3
                + "\n- Promedio: " + averageNote;
    }
    
    
}
