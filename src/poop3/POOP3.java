/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3; // Paquete que contiene la clase POOP3

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Clase principal del programa POOP3.
 * 
 * @author teran
 */
public class POOP3 {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Declaración de arreglos
        int nums[];
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = new int[5];
        int[] nums4;
        nums4 = new int[5];
        
        // Ejemplo de bucle for-each
        System.out.println("########## for each ##########");
        for (int temp : nums2) {
            System.out.println("Cuenta: " + temp);
        }
        
        // Ejemplo de bucle for
        System.out.println("########## for ##########");
        for (int i = 0; i < nums4.length; i++) {
            nums4[i] = i * 10;
        }
        
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }
        
        // Ejemplo de uso de cadenas
        System.out.println("########## String ##########");
        String cadena = new String("Hola Mundo");
        System.out.println(cadena);
        String cadena1 = "Hola Mundo de forma recomendada"; // Forma recomendada
        System.out.println(cadena1);
        
        String nombre = "Diana";
        String apellido = "Terán";
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombre + " " + apellido);
        String nombreCompleto = nombre + " " + apellido; // Camel Case
        System.out.println(nombreCompleto);

        System.out.println("########## Wrapper ##########");
        int a = 4;
        Integer b = new Integer(4);
        System.out.println(b); //deprecated: deprecado (este método ya no se recomienda utilizarlo de esta forma)
        Integer c = 4;
        System.out.println(c);
        Integer d = a; 
        String cadena3 = d.toString();
        String cadena4 = 4 + " ";
        System.out.println(cadena3);
        System.out.println(cadena4);
        
        System.out.println("########## Colecciones ##########");
        System.out.println("########## ArrayList ##########");
        
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();//Las colecciones almacenan referencias
        miArrayList.add(d);
        miArrayList.add(33);
        miArrayList.add(77);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0)); //Arreglos dinámicos //Obteniendo el primer elemento que se va a imprimir
        miArrayList.add(1, 10); // Añadiendo 10 en el índice 1
        System.out.println(miArrayList.size()); // Nuevo tamaño del ArrayList
        System.out.println("***"); //Imprimiedo todos los elementos del ArrayList
        for(Integer temp : miArrayList){
            System.out.println(temp);
        }
        miArrayList.add(77); //Se agregó otro elemento en la última posición
        System.out.println("***");
        for(Integer temp : miArrayList){
            System.out.println(temp);
        } 
        System.out.println("Nuevo tamaño" + " " +miArrayList.size());
        
        System.out.println("########## Hashtable ##########");

Hashtable<Integer, String> miTabla = new Hashtable<Integer, String>(); // Lado izquierdo: orden (llave) Lado derecho: valor
miTabla.put(1, "uno");
miTabla.put(55566778, "Antonio");
miTabla.put(44778899, "Diana");
System.out.println("Elemento en tabla: " + miTabla.size());

System.out.println("########## Enumerador ##########");
Integer llave; 
String valor; 

Enumeration<Integer> enumeradorLlaves = miTabla.keys();
while (enumeradorLlaves.hasMoreElements()) { // ¿Hay elementos a la derecha? Si los hay entra al while y extrae el elemento
    llave = enumeradorLlaves.nextElement();
    valor = miTabla.get(llave);
    System.out.println(llave + " " + valor);
}

// TAREA EXTRA
System.out.println("########## Hashtable ##########");

Hashtable<String, String> miTabla2 = new Hashtable<String, String>(); 
miTabla2.put("Álgebra", "El álgebra es la parte de las matemáticas que se centra en el estudio de las estructuras y reglas generales que gobiernan las operaciones aritméticas y las relaciones numéricas ");
miTabla2.put("Ingeniería", "Es el desarrollo y aplicación del conocimiento científico y tecnológico para satisfacer las necesidades de la sociedad, dentro de los condicionantes físicos, económicos, humanos y culturales");
miTabla2.put("Operador", "Es un símbolo que indica al compilador o intérprete que realice una operación específica en una expresión");
miTabla2.put("Código", "Es un conjunto de archivos que contienen todas las líneas de código del programa, software o aplicación");
miTabla2.put("Programación", "Es el proceso de crear programas que permiten a las computadoras realizar tareas específicas para satisfacer las necesidades de los usuarios y empresas");
System.out.println("Elemento en tabla: " + miTabla2.size());

System.out.println("########## Enumerador ##########");
String llave2; 
String valor2; 

Enumeration<String> enumeradorLlaves2 = miTabla2.keys();
while (enumeradorLlaves2.hasMoreElements()) { 
    llave2 = enumeradorLlaves2.nextElement();
    valor2 = miTabla2.get(llave2);
    System.out.println(llave2 + ": " + valor2);
}

// TAREA EXTRA 
System.out.println("########## Hashtable & Calendar ##########");
Hashtable<String, Calendar> agenda = new Hashtable<>();
Calendar SandraCumpleaños = Calendar.getInstance();
SandraCumpleaños.set(1991, Calendar.MARCH, 10);

Calendar DavidCumpleaños = Calendar.getInstance();
DavidCumpleaños.set(2000, Calendar.DECEMBER, 18);

Calendar MónicaCumpleaños = Calendar.getInstance();
MónicaCumpleaños.set(2004, Calendar.NOVEMBER, 20);

Calendar EduardoCumpleaños = Calendar.getInstance();
EduardoCumpleaños.set(1985, Calendar.SEPTEMBER, 03);

Calendar RominaCumpleaños = Calendar.getInstance();
RominaCumpleaños.set(1997, Calendar.JULY, 24);

agenda.put("Sandra", SandraCumpleaños);
agenda.put("David", DavidCumpleaños);        
agenda.put("Mónica", MónicaCumpleaños);
agenda.put("Eduardo", EduardoCumpleaños);
agenda.put("Romina", RominaCumpleaños);

Enumeration<String> nombres = agenda.keys();
while (nombres.hasMoreElements()) {
    String nombre1 = nombres.nextElement();
    Calendar Cumpleaños = agenda.get(nombre1);
    int año = Cumpleaños.get(Calendar.YEAR);
    int mes = Cumpleaños.get(Calendar.MONTH);
    int dia1 = Cumpleaños.get(Calendar.DAY_OF_MONTH);
    System.out.println("Nombre: " + nombre1);
    System.out.println("Cumpleaños: " + dia1 + "/" + mes + "/" + año);
}
    }
}


