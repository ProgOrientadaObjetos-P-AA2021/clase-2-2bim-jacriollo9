/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete7;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor2 {
    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "Jose";
        String apellido = "Criollo";
        String identificacion = "147852369";
        int edad = 18;
        
        paquete4.EstudiantePresencial estPresencial = new paquete4.EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerCostoCredito(50.5);
        estPresencial.establecerNumeroCreditos(3);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}