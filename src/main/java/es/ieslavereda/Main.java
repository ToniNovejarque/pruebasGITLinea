package es.ieslavereda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("HHTR445","CALAMARDO","Leoncito");
        JefeZona toni = new JefeZona("Toni","Novejarque Escamilla","23944422L","CAMP",89878797,3000,coche1,"ATICO");
        JefeZona trebol = new JefeZona("Trebol","Novejarque Escamilla","23944422L","CAMP",89878797,3000,coche1,"ATICO");
        Vendedor paco = new Vendedor("Paco","Novejarqufdsfasdfa fsdafa","23944422L","CAMP",89878797,3000,coche1,89878797,"araea",new String[]{"Pedro","fds"},234.4);
        System.out.println(toni);
        toni.nuevoVendedor(paco);
        System.out.println(toni);

        toni.etiquetaIdentificativa();
        System.out.println(toni.contingenciasComunes()+"\n"+toni.retencionIRPF());
        paco.etiquetaIdentificativa();
        System.out.println(paco.contingenciasComunes()+"\n"+paco.retencionIRPF());
        paco.cambiarSupervisor(trebol);
        System.out.println(paco);
        toni.cambiarSupervisor(paco);

    }
}