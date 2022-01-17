package com.gm.javadoc;

public class Aritmetica {
    
    /**
     * Primer Operando
     */
    int operandoA;
    
    /**
     * Segundo Operando
     */
    int operandoB;
    
    /**
     * Constructor vacio de la clase.
     */
    public Aritmetica() {
        
    }
    
    /**
     * Constructor con dos argumentos
     * @param operandoA es el primer parametro
     * @param operandoB es el segundo parametro
     */
    public Aritmetica(int operandoA, int operandoB) {
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }

    /**
     * Esta operacion realiza la suma de los dos operandos
     * @return resultado de la suma
     */
    public int sumar() {
        return this.operandoA + this.operandoB;
    }
    
}
