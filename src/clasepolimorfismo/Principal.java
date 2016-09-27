/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasepolimorfismo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import pe.edu.upeu.Entrenador;
import pe.edu.upeu.Futbolista;
import pe.edu.upeu.Masajista;
import pe.edu.upeu.SeleccionFutbol;

/**
 *
 * @author Alumnos
 */
public class Principal {
    BufferedReader teclado =new BufferedReader(new InputStreamReader(System.in));
    
    public int leerTeclado(String dato) throws IOException{
        int datos=0;
        try {
           
            datos=Integer.parseInt(String.valueOf(teclado.readLine()));
                        
        } catch (NumberFormatException e) {System.out.println("ERROR"+e.getMessage());
        }
        return datos;
        }
    public int leerTeclado(double dato) throws IOException{
        int datos=0;
        try {
           
            datos=Integer.parseInt(String.valueOf(teclado.readLine()));
                        
        } catch (NumberFormatException e) {System.out.println("ERROR"+e.getMessage());
        }
        return datos;
        }
    public int leerTeclado(char dato) throws IOException{
        int datos=0;
        try {
           
            datos=Integer.parseInt(String.valueOf(teclado.readLine()));
                        
        } catch (NumberFormatException e) {System.out.println("ERROR"+e.getMessage());
        }
        return datos;
        }
        
        
     
    /**
     */
    public static ArrayList<SeleccionFutbol>
            integrantes=new ArrayList<SeleccionFutbol>(); 
                    
    public static void main(String[] args) throws IOException{
        Principal cp=new Principal();
        Object dato=null;
        try {
            dato=cp.teclado.readLine();
        } catch (Exception e) {
        }
        System.out.println(cp.leerTeclado(dato.toString()));;
        System.out.println(cp.leerTeclado('5'));
        System.out.println(cp.leerTeclado(45.15));
        
        SeleccionFutbol entrenador=new Entrenador(5421, 1, "Vicente", "del Bosque", 60);
        SeleccionFutbol futbolista=new Futbolista(6, "Interior Derecho",2, "Andres ", "Iniesta",30);
        SeleccionFutbol masajista=new Masajista("licenciado de Ficioterapia", 10,3, "Raul", "Cosi", 40);
        
        integrantes.add(entrenador);
        integrantes.add(futbolista);
        integrantes.add(masajista);
        // TODO code application logic here
        for (SeleccionFutbol integrante :integrantes) {
            System.out.println(integrante.getNombre()+" "+integrante.getApellidos()+"->");integrante.concentrarse();
            
        }
            System.out.println("----------------------");
        for (SeleccionFutbol integrante:integrantes) {
            System.out.println(integrante.getNombre()+" "+integrante.getApellidos()+"->");integrante.entrenamiento();
        }
            System.out.println("----------------------");
        for (SeleccionFutbol integrante:integrantes) {
            System.out.println(integrante.getNombre()+" "+integrante.getApellidos()+"->");integrante.partidoFutbol();
        }
    }
}
