package guia7ej01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioRazas {

    static Scanner leer = new Scanner(System.in);

    public static void llenarLista(Razas r1) {
        ArrayList<String> razas = new ArrayList();
        String rta;
        System.out.println("Desea ingresar una nueva raza?");
        rta = leer.next().toLowerCase();

        while (rta.equals("si")) {
            System.out.println("Ingrese el nombre de la raza");
            razas.add(leer.next());
            r1.setRazas(razas);
            System.out.println("Desea ingresar una nueva raza?");
            rta = leer.next().toLowerCase();
        }

    }

    public static void mostrarLista(Razas r1) {
        ArrayList<String> razas = r1.getRazas();
        System.out.println("Ud ha salido del sistema. La lista de razas es");
        for (String i : razas) {
            System.out.println(i);
        }
        System.out.println("La cantidad de datos en el arraylist es de " + razas.size());
    }

    //Ejercicio 2 
    /*
  después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.
     */
    public static void eliminarPerro(Razas r1) {
        System.out.println("Ingrese el perro que desea eliminar");
        String perro = leer.next();
        
// FORMA DIRECTA
//      if (r1.getRazas().contains(perro)) {
//          r1.getRazas().remove(perro);
//          System.out.println("Raza "+perro+" encontrada y eliminada. La nueva lista es");
//      Collections.sort(r1.getRazas()); //ordena la lista
//          System.out.println(r1.getRazas());
//      }else{+
//           Collections.sort(r1.getRazas()); //ordena la lista
//          System.out.println("La raza "+perro+" no está en la lista"); 
//          System.out.println(r1.getRazas());
//      }


//FORMA CON ITERATOR
        Iterator<String> it = r1.getRazas().iterator();
   
        if (r1.getRazas().contains(perro)) {
            while (it.hasNext()) {
                if(it.next().equals(perro)){
                  it.remove();  
                  System.out.println("Raza " + perro + " eliminada");
                }  
            }
        } else{
            System.out.println("No se encontró la raza en la lista");
        }
        
        Collections.sort(r1.getRazas()); //ordena la lista
        System.out.println("Lista ordenada");
        for (String i : r1.getRazas()) {
            System.out.print(i+ " ");
        }
        //impresion alternativa
//        System.out.println(r1.getRazas());
       
    }
   
}
