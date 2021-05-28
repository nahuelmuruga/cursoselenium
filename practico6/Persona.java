package practico6;

public class Persona {

    protected String nombre;
    protected int dni;

    public Persona(String unNombre, int unDni){
        this.nombre = unNombre;
        this.dni = unDni;
    }

    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setDni(int unDni){
        this.dni = unDni;
    }

    public int getDni(){
        return this.dni;
    }

    public String toString(){
        return "La persona " + this.nombre + " tiene DNI " + this.dni;
    }

}
