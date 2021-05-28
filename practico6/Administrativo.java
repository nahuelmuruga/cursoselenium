package practico6;

public class Administrativo extends Persona{

    int nroFuncionario;

    public Administrativo(String unNombre, int unDni){
        super(unNombre, unDni);
    }

    public String toString(){
        return this.nombre + " es un administrativo";
    }
}
