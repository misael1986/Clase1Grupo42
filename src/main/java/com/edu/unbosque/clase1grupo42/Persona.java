/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase1grupo42;

/**
 *
 * @author Usuario
 */
public class Persona {
    String NombreCompleto;
    String primerNombre;
    String segundoNombre;
    String primerApellido;
    String segundoApellido;
    int anho;
    int periodo;
    int fechaNacimiento[]=new int[3];
    
    void matricular(int a, int b){
    this.anho=a;
    this.periodo=b;
    }
    
    String fechaNac(){
    String f=""+this.fechaNacimiento[0]+"-"+
            this.fechaNacimiento[1]+"-"+
            this.fechaNacimiento[2];
    return f;
    }
}
