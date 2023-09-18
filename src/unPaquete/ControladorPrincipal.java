/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unPaquete;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {
    //esta clase tendrá el método main del proyecto
    public static void main(String[] args) {
        //definicion de los ArrayList solicitados
        ArrayList<Cliente> alClientes = new ArrayList<>();
        ArrayList<Empleado> alEmpleado = new ArrayList<>();
        ArrayList<Encargado> alEncargado = new ArrayList<>();
        ArrayList<Producto> alProducto = new ArrayList<>();
        
    // Creacion de objetos            
        Cliente unCliente1 = new Cliente();
        Cliente unCliente2 = new Cliente();
        Cliente unCliente3 = new Cliente();
        
        Empleado unEmpleado1 = new Empleado();
        Empleado unEmpleado2 = new Empleado();
        Empleado unEmpleado3 = new Empleado();
        
        Encargado unEncargado1 = new Encargado();
        Encargado unEncargado2 = new Encargado();
        Encargado unEncargado3 = new Encargado();
        
        Producto unProducto1 = new Producto();
        Producto unProducto2 = new Producto();
        Producto unProducto3 = new Producto();
        
        //Agregado de objetos al array
        alClientes.add(unCliente1);
        alClientes.add(unCliente2);
        alClientes.add(unCliente3);
        
        alEmpleado.add(unEmpleado1);
        alEmpleado.add(unEmpleado2);
        alEmpleado.add(unEmpleado3);
        
        alEncargado.add(unEncargado1);
        alEncargado.add(unEncargado2);
        alEncargado.add(unEncargado3);
        
        alProducto.add(unProducto1);
        alProducto.add(unProducto2);
        alProducto.add(unProducto3);       
          
        //Muestra de Informacion
        for(Cliente cliente: alClientes){
            cliente.mostrar();
        }
               
        for(Encargado encargado: alEncargado){
            encargado.mostrar();
        }
        
        for(Empleado empleado: alEmpleado){
            empleado.mostrar();
        }
        
        for(Producto producto: alProducto){
            producto.mostrar();
        }
    }
    
}
