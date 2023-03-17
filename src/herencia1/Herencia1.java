
package herencia1;

import javax.swing.JOptionPane;

public class Herencia1 {

    public static void main(String[] args) {
      String nombre;
      int numeroMaterias,carnet,edad;
      int promedio;
      nombre=JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante: ","Solicitando Datos: ",2);
      edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad del estudiante: ","Solicitando Datos: ",2)); 
      numeroMaterias=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de materias del estudiante: ","Solicitando Datos: ",2)); 
      carnet=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el canet del estudiante: ","Solicitando Datos: ",2)); 
      promedio=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el promedio del Estudiante: ","Solicitando Datos:",2));
      Estudiante est1=new Estudiante(nombre,edad,carnet,numeroMaterias,promedio);
    }
    
    
}  

