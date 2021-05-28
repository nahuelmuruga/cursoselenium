package practico6;

public class Profesor extends Persona {

    private String materia;

    public Profesor(String unNombre, int unDni, String unaMateria){
        super(unNombre, unDni);
        this.materia = unaMateria;
    }

    public void setMateria(String unaMateria){
        this.materia = unaMateria;
    }

    public String getMateria(){
        return this.materia;
    }

    public String toString(){
        //return "El profesor " + this.nombre + " tiene DNI " + this.dni + " y su materia es " + this.materia;
        return super.toString() + " y dicta " + this.materia;
    }
}
