package practico6;

public class Alumno extends Persona {

    private String curso;

    public Alumno(String unNombre, int unDni, String unCurso){
        super(unNombre, unDni);
        this.curso = unCurso;
    }

    public void setCurso(String unCurso){
        this.curso = unCurso;
    }

    public String getCurso(){
        return this.curso;
    }

    public String toString(){
        return "El alumno es " + this.getNombre() + " de dni " + this.getDni() + " cursa " + this.curso;
    }

}
