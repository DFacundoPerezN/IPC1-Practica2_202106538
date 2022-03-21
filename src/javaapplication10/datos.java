/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Faxx
 */
public class datos {
    private String categoria;   
 private String cantidad;

    public datos(String categoria, String cantidad) {
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getcantidad() {
        return cantidad;
    }

    public void setcantidad(String cantidad) {
        this.cantidad = cantidad;
    }  
}
