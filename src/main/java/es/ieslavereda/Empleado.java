package es.ieslavereda;

public abstract class Empleado implements CotizacionSegSocial{
    private String nombre;
    private String apellido;
    private String DNI;
    private String direccion;
    private int antiguedad;
    private int telefono;
    private double salario;
    protected Empleado informacionSuper;

    public Empleado(String nombre, String apellido, String DNI, String direccion, int telefono, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedad =  0;
        this.telefono = telefono;
        this.salario = salario;
        this.informacionSuper = null;
    }
    public abstract void cambiarSupervisor(Object supervisor);

    public abstract void incrementarSalario(int salario);

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public int getTelefono() {
        return telefono;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString(){
        return "El nombre del trabajador es "+nombre +" "+apellido +", \n DNI: "+DNI+" vive en "+direccion+" lleva trabajando en la empresa: "+antiguedad+" años, su telefono es :"+telefono+" cobra: "+salario +" y lo que se sabe del supervisor es: "+ informacionSuper ;
    }
}
