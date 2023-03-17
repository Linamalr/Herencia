/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

import javax.swing.JOptionPane;

public class Estudiante extends Persona{ 
     private int carnet=0;
     private int promedio=0;
     private int numeroMaterias=0;
             
     public Estudiante(String nombre,int edad,int carnet,int promedioNotas,int numeroMaterias){
         super(nombre,edad);
         this.carnet = carnet;
         this.numeroMaterias = numeroMaterias;
         this.promedio = promedioNotas;
     }

    @Override
     public void ImprimirDatos(){
        JOptionPane.showMessageDialog(null, "Nombre: "+getNombre()+
                "\nEdad: "+getEdad()+ "\nCarnet: "+carnet+"\nPromedio de Notas: "+promedio+"Numero de Materias: "+numeroMaterias );
     
     }
             
          
}
