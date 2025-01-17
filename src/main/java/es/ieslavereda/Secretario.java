package es.ieslavereda;

public class Secretario extends Empleado{
    private String despacho;
    private int numeroFax;


    public Secretario(String nombre, String apellido, String DNI, String direccion, int telefono, double salario, int numeroFax,String despacho){
        super( nombre, apellido,DNI,direccion, telefono,  salario*0.15);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }
    public void cambiarSupervisor(Object supervisor){
        if (supervisor instanceof  Secretario || supervisor instanceof  JefeZona ) {
            Empleado persona = (Empleado)supervisor;
            this.informacionSuper =persona;
        }
        else
            System.out.println("No tiene permiso ese supervisor para supervisar a esta persona");
    }

    public void incrementarSalario(int salario){
        setSalario(getSalario()+salario*0.15);
    }

    public String getDespacho() {
        return despacho;
    }

    public int getNumeroFax() {
        return numeroFax;
    }

    @Override
    public double retencionIRPF(){
        return getSalario()*0.21;
    }

    @Override
    public double contingenciasComunes(){
        return getSalario()*0.03;
    }

    @Override
    public void etiquetaIdentificativa(){
        System.out.println(getNombre()+" "+getApellido());
    }

    @Override
    public String toString(){
        return super.toString() +", el despacho es "+despacho+ " y el numero de fax es: "+numeroFax;
    }
}
