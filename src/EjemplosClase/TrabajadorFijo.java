/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosClase;

/**
 *
 * @author danielsotoortiz
 */
public abstract class TrabajadorFijo extends Empleado{
    
    private int añosExperiencia;

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TrabajadorFijo() {
    }


    public TrabajadorFijo(int añosExperiencia, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public int calculaSueldo() {
        int r=(int) (2000+añosExperiencia*30.5);
        return r;
    }
    
    
    
}
