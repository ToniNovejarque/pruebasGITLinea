package es.ieslavereda;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JefeZona extends Empleado{
    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private Coche cocheEmpresa;


    public JefeZona(String nombre, String apellido, String DNI, String direccion, int telefono, double salario,Coche cocheEmpresa ,String despacho){
        super( nombre, apellido,DNI,direccion, telefono,  salario*0.05);
        this.despacho = despacho;
        this.secretario = null;
        this.vendedores = new Vendedor[1];
        this.cocheEmpresa = cocheEmpresa;
    }
    @Override
    public void cambiarSupervisor(Object supervisor){
        if (supervisor instanceof  JefeZona) {
            JefeZona persona = (JefeZona)supervisor;
            this.informacionSuper =persona;
        }
        else
            System.out.println("No tiene permiso ese supervisor para supervisar a esta persona");
    }
    @Override
    public void incrementarSalario(int salario){
        setSalario(getSalario()+salario*0.05);
    }
    public void cambiarCoche(Coche cocheNuevo){
        cocheEmpresa = cocheNuevo;
    }

    @Override
    public double retencionIRPF(){
        return getSalario()*0.30;
    }

    @Override
    public double contingenciasComunes(){
        return getSalario()*0.05;
    }

    @Override
    public void etiquetaIdentificativa(){
        System.out.println(getNombre()+" "+getApellido());
    }

    public void nuevoVendedor(Vendedor vendedor){
        vendedores = Arrays.copyOf(vendedores,vendedores.length+1);
        vendedores[vendedores.length-1] =  vendedor;
    }
    public void borrarVendedor(Vendedor vendedor){
        for (int i = 0; i < vendedores.length; i++) {
            if (vendedores[i].equals(vendedor))
                vendedores[i] = null;
        }
    }
    @Override
    public String toString(){
        return super.toString()+" el despacho: "+despacho+" secretario "+ secretario+" vendedores:" + Arrays.toString(vendedores)+" coche de empresa"+ cocheEmpresa;
    }
}
