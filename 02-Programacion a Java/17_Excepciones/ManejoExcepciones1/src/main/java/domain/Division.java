package domain;

public class Division {

    private int numerador;
    private int denominador;

    public Division(int numerador, int denominador) throws OperacionExcepcion {
        if(this.denominador == 0) {
            throw new OperacionExcepcion("Denominador igual a CERO.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void visualizarOperacion() {
        System.out.println("Resultado: " + this.numerador/this.denominador);
    }
    
    
    
}
