package es.ieslavereda;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vendedor extends  Empleado{
    private Coche cocheEmpresa;
    private int movil;
    private String areaVenta;
    private String[] clientes;
    private double porcentajeVentas;


    public Vendedor(String nombre, String apellido, String DNI, String direccion, int telefono, double salario, Coche cocheEmpresa,int movil, String areaVenta,String[] clientes, double porcentajeVentas){
        super( nombre, apellido,DNI,direccion, telefono,  salario*0.10);
        this.cocheEmpresa = cocheEmpresa;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.clientes = clientes;
    }
    public void cambiarSupervisor(Object supervisor){
        if (supervisor instanceof  Vendedor || supervisor instanceof  JefeZona ) {
            Empleado persona = (Empleado)supervisor;
            this.informacionSuper =persona;
        }
        else
            System.out.println("No tiene permiso ese supervisor para supervisar a esta persona");
    }

    public void incrementarSalario(int salario){
        setSalario(getSalario()+salario*0.10);
    }

    public void nuevoCliente(String cliente){
        clientes = Arrays.copyOf(clientes,clientes.length+1);
        clientes[cliente.length()] =  cliente;
    }
    public void borrarCliente(String cliente){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].equals(cliente))
                clientes[i] = "";
        }
    }

    public void cambiarCoche(Coche cocheNuevo){
        cocheEmpresa = cocheNuevo;
    }
    @Override
    public double retencionIRPF(){
        return getSalario()*0.24;
    }

    @Override
    public double contingenciasComunes(){
        return getSalario()*0.04;
    }

    @Override
    public void etiquetaIdentificativa(){
        System.out.println(getNombre()+" "+getApellido());
    }

    @Override
    public String toString(){
        return super.toString()+ " Coche de empresa :"+ cocheEmpresa+" movil "+ movil+ " Cliente que lleva"+ Arrays.toString(clientes) +" porcetaje que se lleva por venta :" + porcentajeVentas;
    }
}
