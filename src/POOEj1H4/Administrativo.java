package POOEj1H4;

class Administrativo extends Empleado {

    nIngles ni;

    public Administrativo() {
    }

    public Administrativo(nIngles ni, String nombre, int edad, boolean casado) throws EEdadNoValida {
        super(nombre, edad, casado);
        this.ni = ni;
    }

    public double calcularSalario(int horasExtra) {

        double r;

        r = salario + (horasExtra * 20);

        return r;

    }

    public nIngles getNi() {
        return ni;
    }

    public void setNi(nIngles ni) {
        this.ni = ni;
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

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "ni=" + ni + '}';
    }
    
    

}

enum nIngles {
    Alto, bajo, medio
}
