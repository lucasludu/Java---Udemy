package beans;

import java.io.Serializable;

public class PersonaBeans implements Serializable {

    private String nombre;
    private int edad;

    public PersonaBeans() {
    }

    public PersonaBeans(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "PersonaBeans{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
