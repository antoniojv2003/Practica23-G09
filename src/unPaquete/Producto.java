/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unPaquete;

/**
 *
 * @author estudiante
 */
public class Producto {
    //definicion de los atributos
    String nombre;
    String descripcion;
    String estado; //disponible o no disponible
    float precio;
    
    public void mostrar()
    {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Descripcion: "+ descripcion);
        System.out.println("Estado: "+ estado);
        System.out.println("Precio: "+ precio);
    }
    
}
