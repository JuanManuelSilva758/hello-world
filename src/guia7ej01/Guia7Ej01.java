/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
*/
package guia7ej01;


public class Guia7Ej01 {

    public static void main(String[] args) {
      
     Razas r1 = new Razas();   
     ServicioRazas.llenarLista(r1);
     ServicioRazas.mostrarLista(r1);
     ServicioRazas.eliminarPerro(r1);
        
    }
    
}
