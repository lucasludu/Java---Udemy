package entidades;

import enumeracion.TipoEscritura;

public class Escritor extends Empleado {
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
    public String getTipoEscrituraEnTexto() {
        return tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return super.toString() + " Escritor{" + "tipoEscritura=" + tipoEscritura.getDescripcion() + '}';
    }
    
}
