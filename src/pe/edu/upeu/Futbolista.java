/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu;

/**
 *
 * @author Alumnos
 */
public class Futbolista extends SeleccionFutbol{
    int dorsal;
    String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    
    @Override
    public void entrenamiento(){
        System.out.println("realiza un entrenamiento"+"(clase futbolista)");
    
    }
    @Override
    public void partidoFutbol(){
        System.out.println("juega un partido (clase entrenador)");
        }
}
