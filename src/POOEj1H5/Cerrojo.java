package POOEj1H5;

public class Cerrojo {

    private String combinacion;
    private boolean abierto=false;

    boolean abrir(String comPrueba) {
        if (comPrueba.equals(combinacion)) {
            abierto = true;
            return true;
        } else {
            return false;
        }
    }

    boolean cambiarCombinacion(String nuevaCombinacion, String combinacion) {

        if (combinacion.equals(this.combinacion)) {

            this.combinacion = nuevaCombinacion;
            return true;
        } else {
            return false;
        }

    }

    void cerrar() {

        this.abierto = false;
    }

    public String getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(String combinacion) {
        this.combinacion = combinacion;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public Cerrojo() {
    }

    public Cerrojo(String combinacion) {
        this.combinacion = combinacion;
    }
    
    

}
