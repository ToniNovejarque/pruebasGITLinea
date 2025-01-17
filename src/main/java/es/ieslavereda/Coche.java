package es.ieslavereda;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;

    public Coche(String matricula,String marca,String modelo){
        this.matricula =  matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString(){
        return "La matricula: "+matricula +" Marca: "+marca+" y modelo: "+modelo;
    }
}
