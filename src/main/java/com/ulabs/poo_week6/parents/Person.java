/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_week6.parents;

/**
 *
 * @author manuelguarniz
 */
public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String email;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    
    private String autogenerateEmail() {
        String firstChar = firstname.substring(0, 1).toLowerCase();
        String fatherLastname = lastname.split(" ")[0].toLowerCase();
        return String.format("%s%s@utp.edu.pe", firstChar, fatherLastname);
    }
    
    protected String showInformation() {
        return "- Nombre: " + firstname
                + "\n- Apellidos: " + lastname
                + "\n- Edad: " + age
                + "\n- Correo: " + autogenerateEmail();
    }
}
