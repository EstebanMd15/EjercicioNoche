/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

//**********************
public class Persona {

private String nombre;
private int edad;
private String nacionalidad;
//CONSTRUCTOR
    public Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
// METODOS GETTERS 
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
//**********************
    public static void main(String[] args) {
     Persona per1 = new Persona("Esteban Meneses", 19,"Colombiano");
     per1.getEdad();
     per1.getNacionalidad();
     per1.getNombre();
        System.out.println("Soy "+ per1.getNombre());
        System.out.println("Tengo "+ per1.getEdad() + " anhos de edad");
        System.out.println("Y vivo en "+ per1.getNacionalidad());
    }
    
}
