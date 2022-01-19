package abstracto.domain;

public abstract class FiguragGeometrica {
    
    protected String tipoFigura;

    protected FiguragGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    // La clase padre no define el comportamiento
    public abstract void dibujar();    

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguragGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
}
