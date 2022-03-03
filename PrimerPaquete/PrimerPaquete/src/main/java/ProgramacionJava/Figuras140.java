package ProgramacionJava;
public abstract class Figuras140 {
    protected String tipoFigura;
    
    protected Figuras140(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    //la clase padre no define el comprotamienton
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "Figuras140{" + "tipoFigura=" + tipoFigura + '}';
    }
    
    
    
    
    
}
